package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = BranchDeserializer.class)
public interface Branch {

    @JsonProperty()
    String name();

    @JsonProperty()
    Branch branch();

}
