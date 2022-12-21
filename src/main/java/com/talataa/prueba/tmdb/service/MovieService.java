package com.talataa.prueba.tmdb.service;

import com.talataa.prueba.tmdb.client.MovieClient;
import com.talataa.prueba.tmdb.dto.MovieInfoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieClient movieClient;

    public MovieInfoDTO getMovie(int id){
        return movieClient.getMovieInfo(id);
    }


}
