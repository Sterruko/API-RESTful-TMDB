package com.talataa.prueba.tmdb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class MovieListDTO {

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("items")
  private List<InfoMovieListDTO> infoMovieListDTOList;


  public MovieListDTO() {
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public List<InfoMovieListDTO> getMovieDTOList() {
    return infoMovieListDTOList;
  }

  public void setMovieDTOList(List<InfoMovieListDTO> infoMovieListDTOList) {
    this.infoMovieListDTOList = infoMovieListDTOList;
  }
}
