package com.talataa.prueba.tmdb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddMovieListRequest {

  @JsonProperty("media_id")
  private int mediaId;

  public AddMovieListRequest() {
  }

  public int getMediaId() {
    return mediaId;
  }

  public void setMediaId(int mediaId) {
    this.mediaId = mediaId;
  }
}
