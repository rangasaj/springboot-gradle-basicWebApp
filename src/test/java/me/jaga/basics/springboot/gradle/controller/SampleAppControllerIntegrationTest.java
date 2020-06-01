package me.jaga.basics.springboot.gradle.controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleAppControllerIntegrationTest {

    @LocalServerPort
    private int port;

    private String url;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @BeforeEach
    private  void setUp() {
         this.url = "http://localhost:" + port;
    }

    @Test
    public void testController() {
        String expMsg = "Welcome Greetings!";

        ResponseEntity<String> response = testRestTemplate.getForEntity(url,String.class);
        Assertions.assertEquals(expMsg, response.getBody(), "Message matches");
    }

}
