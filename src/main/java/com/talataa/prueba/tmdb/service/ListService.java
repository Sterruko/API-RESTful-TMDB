package com.talataa.prueba.tmdb.service;


import com.talataa.prueba.tmdb.client.ListClient;
import com.talataa.prueba.tmdb.client.ListV4Client;
import com.talataa.prueba.tmdb.constants.Constants;
import com.talataa.prueba.tmdb.dto.AddMovieListRequest;
import com.talataa.prueba.tmdb.dto.GenericResponseDTO;
import com.talataa.prueba.tmdb.dto.InfoMovieListDTO;
import com.talataa.prueba.tmdb.dto.MovieListDTO;
import com.talataa.prueba.tmdb.dto.ResponseListDTO;
import com.talataa.prueba.tmdb.dto.UpdateListRequest;
import com.talataa.prueba.tmdb.dto.WishListDTO;
import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ListService {

    private final ListClient listClient;
    private final ListV4Client listV4Client;

    private Environment environment;

    public ResponseListDTO createWishList(WishListDTO wishListDTO){
        return listClient.createWishList(wishListDTO);
    }

    public GenericResponseDTO addMovieToList(int listId, AddMovieListRequest addMovieListRequest) {
        return listClient.addMovieToWishList(listId, addMovieListRequest);
    }

    public GenericResponseDTO deleteList(int listId){
        return listClient.deleteList(listId);
    }

    public GenericResponseDTO updateWishList(int listId, UpdateListRequest updateListRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        return listV4Client.updateWishList(listId, updateListRequest, Constants.REQUEST_TOKEN, headers);
    }

    public List<InfoMovieListDTO> listMoviesByListId(int listId, int page) {
        MovieListDTO movieListDTO = listClient.listMoviesByWishList(listId);

        int quantityMovies = movieListDTO.getMovieDTOList().size();

        int indexStart = (page - 1) * 20;

        int possibleIndexEnd = (page * 20) - 1;
        int indexEnd = Math.min(quantityMovies, possibleIndexEnd);

        List<InfoMovieListDTO> infoMovieListDTOList = new ArrayList<>();
        for(int i = indexStart; i < indexEnd; i++) {
            infoMovieListDTOList.add(movieListDTO.getMovieDTOList().get(i));
        }

        return infoMovieListDTOList;

    }
}
