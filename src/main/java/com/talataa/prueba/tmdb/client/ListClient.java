package com.talataa.prueba.tmdb.client;

import com.talataa.prueba.tmdb.configuration.TMDBClientConfig;


import com.talataa.prueba.tmdb.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ListClient", url = "${external.api.base-url}", configuration = TMDBClientConfig.class)
public interface ListClient {

  @PostMapping("list" + "?${external.api.api-key}" + "&${external.api.session-id}")
  ResponseListDTO createWishList(@RequestBody WishListDTO wishListDTO);

  @PostMapping("list/{list_id}/add_item" + "?${external.api.api-key}" + "&${external.api.session-id}")
  GenericResponseDTO addMovieToWishList(@PathVariable("list_id") int listId,
                                        @RequestBody AddMovieListRequest addMovieListRequest);

  @DeleteMapping("list/{list_id}" + "?${external.api.api-key}" + "&${external.api.session-id}")
  GenericResponseDTO deleteList(@PathVariable("list_id") int listId);

  @GetMapping("list/{list_id}" + "?${external.api.api-key}")
  MovieListDTO listMoviesByWishList(@PathVariable("list_id") int listId);

}
