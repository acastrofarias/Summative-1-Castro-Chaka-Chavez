package com.company.Summative1CCC.controller;


// model and controller for Word API
import com.company.Summative1CCC.models.Definition;
import com.company.Summative1CCC.models.Quote;
import com.company.Summative1CCC.controller.QuoteController;
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

@WebMvcTest(QuoteController.class)
public class QuoteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private List<Quote> quoteList;

    @BeforeEach
    public void setUp(){

    }

    @Test
    public void shouldReturnRandomQuote() throws Exception {
        // ARRANGE
       Quote testQuote = new Quote();

        String outputJson = mapper.writeValueAsString(testQuote);

        // ACT
        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk())
                // ASSERT
                .andExpect(content().json(outputJson));
    }

}
