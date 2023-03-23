package dev.janey.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *The controller layer is responsible for handling HTTP requests and responses.
 * It receives requests from the client, calls the appropriate service method,
 * and returns a response to the client.
 */


@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
  @Autowired
  private MovieService movieService;

  @GetMapping
  public ResponseEntity getAllMovies(){
    return new ResponseEntity<String>("All movies", HttpStatus.OK);
  }
}
