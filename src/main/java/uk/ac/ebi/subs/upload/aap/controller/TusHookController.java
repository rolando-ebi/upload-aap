package uk.ac.ebi.subs.upload.aap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.ac.ebi.subs.upload.aap.dto.HookEventMessage;
import uk.ac.ebi.subs.upload.aap.service.HookHandlerService;

/**
 * Created by rolando on 26/05/2017.
 */
@RestController
@RequestMapping("")
public class TusHookController {
    @Autowired
    private HookHandlerService hookHandlerService;

    @RequestMapping(method = RequestMethod.POST, path = "/hook")
    public void processHook(@RequestHeader(name = "Hook-Name") String hookType,
                            @RequestBody HookEventMessage hookEventMessage) {
        if (hookType.equals("pre-create")) {
            hookHandlerService.handlePrecreateEvent(hookEventMessage);
        }
    }
}
