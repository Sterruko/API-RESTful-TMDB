package com.talataa.prueba.tmdb.dto;

public class UpdateListRequest {

  private String name;
  private String description;


  public UpdateListRequest() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
