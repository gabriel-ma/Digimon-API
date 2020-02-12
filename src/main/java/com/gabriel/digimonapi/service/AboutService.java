package com.gabriel.digimonapi.service;

import com.gabriel.digimonapi.About.About;
import org.springframework.stereotype.Service;

@Service
public class AboutService {
  public About retrieveApplicationInformation() {
    return new About("This is the version 1 of the Digimon Api", "1.0");
  }
}
