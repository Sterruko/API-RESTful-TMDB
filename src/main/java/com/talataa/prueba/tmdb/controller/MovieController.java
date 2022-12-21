package com.talataa.prueba.tmdb.controller;

import com.talataa.prueba.tmdb.dto.MovieInfoDTO;
import com.talataa.prueba.tmdb.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies/")
@RequiredArgsConstructor
public class MovieController {


    private final MovieService movieService;

    @GetMapping("movie/{id}")
    public ResponseEntity<MovieInfoDTO> getMovie(@PathVariable int id) {
        return new ResponseEntity<>(movieService.getMovie(id), HttpStatus.OK);
    }

    

}
