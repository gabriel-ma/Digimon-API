package com.gabriel.digimonapi.controller;

import com.gabriel.digimonapi.About.About;
import com.gabriel.digimonapi.service.AboutService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutController {

  private AboutService aboutService;

  public AboutController(final AboutService aboutService) {

    this.aboutService = aboutService;
  }

  @GetMapping("/about")
  public ResponseEntity<About> about() {
      return new ResponseEntity<>(aboutService.retrieveApplicationInformation(), HttpStatus.OK);
  }
}
