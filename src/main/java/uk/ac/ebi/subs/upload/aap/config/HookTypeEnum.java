package uk.ac.ebi.subs.upload.aap.config;

/**
 * Created by rolando on 26/05/2017.
 */
public enum HookTypeEnum {
    PRE_CREATE("pre-create"),
    POST_RECEIVE("post-receive"),
    POST_FINISH("post-finish"),
    POST_TERMINATE("post-terminate");

    HookTypeEnum(String s) {

    }
}
