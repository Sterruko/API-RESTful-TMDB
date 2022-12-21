package com.talataa.prueba.tmdb.controller;

import com.talataa.prueba.tmdb.dto.*;
import com.talataa.prueba.tmdb.service.ListService;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/list/")
@RequiredArgsConstructor
public class ListController {

  private final ListService listService;

  @PostMapping("list")
  public ResponseEntity<ResponseListDTO> createWishList(@RequestBody WishListDTO wishListDTO) {
    return new ResponseEntity<>(listService.createWishList(wishListDTO), HttpStatus.OK);
  }

  @PostMapping("add-movie/{list_id}")
  public ResponseEntity<GenericResponseDTO> addMovieToWishList(@PathVariable("list_id") int listId,
                                                               @RequestBody AddMovieListRequest addMovieListRequest) {
    return new ResponseEntity<>(listService.addMovieToList(listId, addMovieListRequest), HttpStatus.OK);
  }

  @DeleteMapping("delete/{list_id}")
  ResponseEntity<GenericResponseDTO> deleteList(@PathVariable("list_id") int listId) {
    return new ResponseEntity<>(listService.deleteList(listId), HttpStatus.OK);
  }

  @PutMapping("update-list/{list_id}")
  ResponseEntity<GenericResponseDTO> updateWishList(@PathVariable("list_id") int listId,
                                                    @RequestBody UpdateListRequest updateListRequest) {
    return new ResponseEntity<>(listService.updateWishList(listId, updateListRequest), HttpStatus.OK);
  }

  @GetMapping("get-movies-list/{list_id}/movies")
  ResponseEntity<List<InfoMovieListDTO>> listMoviesByWishList(@PathVariable("list_id") int listId, @RequestParam("page") int page) {
    return new ResponseEntity<>(listService.listMoviesByListId(listId, page), HttpStatus.OK);
  }

}
