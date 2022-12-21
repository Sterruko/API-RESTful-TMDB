package com.talataa.prueba.tmdb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseListDTO extends GenericResponseDTO {

    @JsonProperty("list_id")
    private int listID;

    public ResponseListDTO() {
    }

    public int getListID() {
        return listID;
    }

    public void setListID(int listID) {
        this.listID = listID;
    }
}
