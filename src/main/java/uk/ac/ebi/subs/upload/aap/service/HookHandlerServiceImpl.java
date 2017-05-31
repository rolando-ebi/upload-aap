package uk.ac.ebi.subs.upload.aap.service;

import org.springframework.stereotype.Service;
import uk.ac.ebi.subs.upload.aap.dto.HookEventMessage;
import uk.ac.ebi.subs.upload.aap.dto.PrecreateMetaData;

@Service
public class HookHandlerServiceImpl implements HookHandlerService{

    @Override
    public void handlePrecreateEvent(HookEventMessage hookEventMessage) {
        PrecreateMetaData metaData = PrecreateMetaData.fromMap(hookEventMessage.getMetaData());

        String username = metaData.getUsername();
        String jwt = metaData.getAuthorization();
        String filePath = metaData.getDesiredPath();

        // do checks...
    }
}
