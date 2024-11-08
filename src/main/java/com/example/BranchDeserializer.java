package com.example;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class BranchDeserializer extends StdDeserializer<Branch> {
    private static final long serialVersionUID = 1L;

    public BranchDeserializer() {
        this(null);
    }

    public BranchDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Branch deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        return jp.getCodec().treeToValue(node, BranchImpl.class);
    }

}
