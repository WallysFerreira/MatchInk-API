package com.matchink.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonPatch {
    private String op;
    private String path;
    private String value;

    public JsonPatch(@JsonProperty("op") String op, @JsonProperty("path") String path, @JsonProperty("value") String value) {
        this.op = op;
        this.path = path;
        this.value = value;
    }

    public String getOp() {
        return op;
    }

    public String getPath() {
        return path;
    }

    public String getValue() {
        return value;
    }
}
