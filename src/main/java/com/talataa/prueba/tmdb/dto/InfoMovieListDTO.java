package com.talataa.prueba.tmdb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoMovieListDTO {

  @JsonProperty("name")
  private String name;


  public InfoMovieListDTO() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
