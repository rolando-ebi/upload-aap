package uk.ac.ebi.subs.upload.aap.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by rolando on 26/05/2017.
 */
public class HookEventMessage {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("Size")
    private long size;
    @JsonProperty("Offset")
    private long offset;
    @JsonProperty("IsFinal")
    private boolean isFinal;
    @JsonProperty("IsPartial")
    private boolean isPartial;
    @JsonProperty("PartialUploads")
    private List<String> partialUploads;
    @JsonProperty("MetaData")
    private Map<String, String> metaData;

    public HookEventMessage() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public boolean isPartial() {
        return isPartial;
    }

    public void setPartial(boolean partial) {
        isPartial = partial;
    }

    public List<String> getPartialUploads() {
        return partialUploads;
    }

    public void setPartialUploads(List<String> partialUploads) {
        this.partialUploads = partialUploads;
    }

    public Map<String, String> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<String, String> metaData) {
        this.metaData = metaData;
    }
}
