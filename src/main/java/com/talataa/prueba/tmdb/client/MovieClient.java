package com.talataa.prueba.tmdb.client;

import com.talataa.prueba.tmdb.configuration.TMDBClientConfig;
import com.talataa.prueba.tmdb.dto.MovieInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MovieClient", url = "${external.api.base-url}", configuration = TMDBClientConfig.class)
public interface MovieClient {

    @GetMapping("movie/{id}" + "?${external.api.api-key}")
    MovieInfoDTO getMovieInfo(@PathVariable int id);
}

