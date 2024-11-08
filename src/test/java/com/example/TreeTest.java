package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TreeTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testTree() throws JsonProcessingException {
        Tree tree = new Tree("tree", new BranchImpl("branch1", null), 10);
        String json = objectMapper.writeValueAsString(tree);

        System.out.println(json);

        Tree tree1 = objectMapper.readValue(json, Tree.class);
        System.out.println(tree1);
    }

}