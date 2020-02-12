package com.gabriel.digimonapi.About;

import lombok.Getter;

@Getter
public class About {

  private final String information;
  private final String version;

  public About(final String Information, final String Version) {

    information = Information;
    version = Version;
  }
}
