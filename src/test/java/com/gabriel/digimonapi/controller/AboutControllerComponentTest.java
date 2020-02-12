package com.gabriel.digimonapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class AboutControllerComponentTest {

  @Autowired private MockMvc mockMvc;

  @Test
  public void shouldGetApplicationInformation() throws Exception {
    MockHttpServletResponse aboutResponse =
        mockMvc.perform(get("/about")).andReturn().getResponse();

    assertThat(aboutResponse.getStatus()).isEqualTo(HttpStatus.OK.value());
    assertThat(aboutResponse.getContentAsString())
        .contains("This is the version 1 of the Digimon Api");
  }
}
