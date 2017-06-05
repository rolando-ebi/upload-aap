package uk.ac.ebi.subs.upload.aap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.stereotype.Service;
import uk.ac.ebi.subs.upload.aap.dto.HookEventMessage;
import uk.ac.ebi.subs.upload.aap.dto.PrecreateMetaData;
import uk.ac.ebi.tsc.aap.client.model.Domain;
import uk.ac.ebi.tsc.aap.client.model.User;
import uk.ac.ebi.tsc.aap.client.security.TokenHandler;

@Service
public class HookHandlerServiceImpl implements HookHandlerService{

    @Autowired
    private TokenHandler tokenHandler;

    @Override
    public void handlePrecreateEvent(HookEventMessage hookEventMessage) {
        PrecreateMetaData metaData = PrecreateMetaData.fromMap(hookEventMessage.getMetaData());

        String username = metaData.getUsername();
        String jwt = metaData.getAuthorization();
        String filePath = metaData.getDesiredPath();

        // do checks...

        User aapUser = tokenHandler.parseUserFromToken(jwt);
        String usernameInJwt = aapUser.getEmail();

        if (! username.equals(usernameInJwt)) {
            throw new AuthorizationServiceException("Not authorized");
        }

        if (! isAuthorizedForFilePath(filePath, aapUser)) {
            throw new AuthorizationServiceException("Not authorized for this file path");
        }
    }

    /**
     * checks is the user is allowed to write file to the specified path by inspecting desired file path string
     * for an AAP domain that user is part of
     *
     * deliberately simple and naive implementation
     *
     * @param filePath
     * @param user
     * @return
     */
    private boolean isAuthorizedForFilePath(String filePath, User user) {
        for (Domain domain : user.getDomains()) {
            if (filePath.contains(domain.getDomainName())) {
                return true;
            }
        }

        return false;
    }
}
