# RESTful API The movie database

This API provides services to create, update ande delete movie lists, as well as the option to add movies to those lists.

It also allows you to consult the list of films by list and makes use of pagination.


## Swagger UI
```bash
http://localhost:8083/swagger-ui/index.html#/
```

## How to consume this API

The endpoints to consume the API are as follows:

Get information Movies for id

```bash
  curl --location --request GET 'http://localhost:8083/api/v1/movies/movie/{movie_id}'
  ```

Create list of movies
```bash
curl --location --request POST 'http://localhost:8083/api/v1/list/list' \
--header 'Content-Type: application/json' \
--data-raw '{
  "name": "nueva lista",
  "description": "nueva lista",
  "language": "en"
}'
```

Add movie to the list
```bash
curl --location --request POST 'http://localhost:8083/api/v1/list/add-movie/{lis_id}' \
--header 'Content-Type: application/json' \
--data-raw '{
  "media_id": 551
}'
```

Update Information list
```bash
curl --location --request PUT 'http://localhost:8083/api/v1/list/update-list/{lis_id}' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "nuevo nombre api",
    "description": "new description api"
}'
```

Delete List
```bash
curl --location --request DELETE 'http://localhost:8083/api/v1/list/delete/{lis_id}'
```
## API Reference
 Description

Welcome to version 3 of The Movie Database (TMDB) API. Below you will find a current list of the available methods on our movie, tv, actor and image API. 

URL for more information
```bash
https://developers.themoviedb.org/3/getting-started/introduction
```

Please note that the API registration process is not optimized for mobile devices so you should access these pages on a desktop computer and browser.