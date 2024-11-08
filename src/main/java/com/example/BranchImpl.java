package com.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public record BranchImpl(String name, Branch branch) implements Branch {

    @JsonCreator
    public BranchImpl(@JsonProperty("name") String name, @JsonProperty("branch") Branch branch) {
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "BranchImpl{" +
                "name='" + name + '\'' +
                ", branch=" + branch +
                '}';
    }
}
