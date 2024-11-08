package com.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public record Tree(String name, @JsonDeserialize(using = BranchDeserializer.class) Branch branch, int height) {
    @JsonCreator
    public Tree(@JsonProperty("name") String name, @JsonProperty("branch") Branch branch,
                @JsonProperty("height") int height) {
        this.name = name;
        this.branch = branch;
        this.height = height;
    }

    @Override
    public Branch branch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", branch=" + branch +
                ", height=" + height +
                '}';
    }
}
