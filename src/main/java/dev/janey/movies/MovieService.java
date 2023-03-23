package dev.janey.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/*
* The service layer is responsible for implementing the application's business logic.
* It provides a set of methods that encapsulate the application's use cases and workflows.
* The service layer may interact with one or more repository classes to perform CRUD operations on the data
* */
@Service
public class MovieService {
  @Autowired
  private MovieRepository movieRepository;
  public List<Movie> allMovies(){
    return movieRepository.findAll();
  }

  public Optional<Movie> singleMovie(String imdbId){
    return movieRepository.findMovieByImdbId(imdbId);
  }
}
