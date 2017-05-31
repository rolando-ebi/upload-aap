package uk.ac.ebi.subs.upload.aap.dto;

import java.util.Map;

/**
 * Created by rolando on 26/05/2017.
 */
public class PrecreateMetaData {
    private String authorization;
    private String username;
    private String desiredPath;

    public PrecreateMetaData() {
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesiredPath() {
        return desiredPath;
    }

    public void setDesiredPath(String desiredPath) {
        this.desiredPath = desiredPath;
    }

    public static PrecreateMetaData fromMap(Map<String, String> map) {
        PrecreateMetaData precreateMetaData = new PrecreateMetaData();

        precreateMetaData.setAuthorization(map.get("Authorization"));
        precreateMetaData.setUsername(map.get("username"));
        precreateMetaData.setDesiredPath(map.get("desiredPath"));

        return precreateMetaData;
    }
}
