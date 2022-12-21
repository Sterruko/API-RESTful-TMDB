package com.talataa.prueba.tmdb.client;

import com.talataa.prueba.tmdb.configuration.TMDBClientConfig;
import com.talataa.prueba.tmdb.dto.GenericResponseDTO;
import com.talataa.prueba.tmdb.dto.UpdateListRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ListV4Client", url = "${external.api-v4.base-url}", configuration = TMDBClientConfig.class)
public interface ListV4Client {

  @PutMapping("list/{list_id}")
  GenericResponseDTO updateWishList(@PathVariable("list_id") int listId,
                                    @RequestBody UpdateListRequest updateListRequest,
                                    @RequestHeader("authorization") String authorization,
                                    @RequestHeader(name = "Content-Type")
                                    HttpHeaders headers
  );


}
