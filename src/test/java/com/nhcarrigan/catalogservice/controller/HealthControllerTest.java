package com.nhcarrigan.catalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.beans.Transient;
import java.util.HashMap;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional

public class HealthControllerTest{

    @Autowired
    private MockMvc mockMvc;

    @Test
    void healthCheckReturnServiceStatus() throws Exception{
        mockMvc.perform(get("/health"))
        .andExpect(status().isOk().jsonPath("$.service", is("200 OK")));
    }
}