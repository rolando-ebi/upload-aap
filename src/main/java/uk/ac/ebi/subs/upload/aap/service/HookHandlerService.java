package uk.ac.ebi.subs.upload.aap.service;

import uk.ac.ebi.subs.upload.aap.dto.HookEventMessage;

/**
 * Created by rolando on 26/05/2017.
 */
public interface HookHandlerService {
    public void handlePrecreateEvent(HookEventMessage hookEventMessage);
}
