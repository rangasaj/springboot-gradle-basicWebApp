package me.jaga.basics.springboot.gradle.controller;

import me.jaga.basics.springboot.gradle.service.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class SampleAppControllerUnitTest {

    @MockBean
    private GreetingService greetingService;

    @Autowired
    private MockMvc mockMvc;

    private final String url = "http://localhost:61999";

    @BeforeEach
    private void setUp() {
        Mockito.when(greetingService.getGreetingMessage()).thenReturn("Welcome Greetings!");
    }

    @Test
    public void testController() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(url)).andExpect(status().isOk()).andExpect(content().string(equalTo("Welcome Greetings!")));
    }
}
