package com.gabriel.digimonapi.controller;

import com.gabriel.digimonapi.About.About;
import com.gabriel.digimonapi.service.AboutService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AboutControllerTest {

  @Mock private AboutService aboutService;

  @Test
  void callAboutServiceToShowInformationOfTheApplication() {
    AboutController aboutController = new AboutController(aboutService);

    aboutController.about();

    verify(aboutService).retrieveApplicationInformation();
  }

  @Test
  void responseShouldBeOkWhenAboutServiceRetrievesInformation() {
      AboutController aboutController = new AboutController(aboutService);

      ResponseEntity<About> about = aboutController.about();

      assertThat(about.getStatusCode()).isEqualTo(HttpStatus.OK);
  }
}
