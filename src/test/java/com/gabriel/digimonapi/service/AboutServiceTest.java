package com.gabriel.digimonapi.service;

import com.gabriel.digimonapi.About.About;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AboutServiceTest {

  @Test
  void createsAboutInformationOfTheApplication() {
    AboutService aboutService = new AboutService();

    String expectedInformation = "This is the version 1 of the Digimon Api";
    About retrievedInformation = aboutService.retrieveApplicationInformation();

    assertThat(expectedInformation).isEqualTo(retrievedInformation.getInformation());
  }

  @Test
  void returnAboutInformationWithVersion() {
    AboutService aboutService = new AboutService();

    String expectedVersion = "1.0";
    About retrievedVersion = aboutService.retrieveApplicationInformation();

    assertThat(expectedVersion).isEqualTo(retrievedVersion.getVersion());
  }
}
