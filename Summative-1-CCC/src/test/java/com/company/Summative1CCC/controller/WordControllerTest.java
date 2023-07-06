package com.company.Summative1CCC.controller;

// model and controller for Word API
import com.company.Summative1CCC.models.Definition;
import com.company.Summative1CCC.controller.WordController;

// used in all controller tests
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(WordController.class)
public class WordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private List<Definition> definitionList;

    @BeforeEach
    public void setUp(){

    }

    // Testing GET /word
    @Test
    public void shouldReturnWordAndDefinition() throws Exception {
        // ARRANGE
        Definition testDefinition = new Definition();

//        String outputJson = mapper.writeValueAsString(testDefinition);

        // ACT
        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());
                // ASSERT
//                .andExpect(content().json(outputJson));
    }
}
