package dev.janey.movies;

/*
* The repository layer is responsible for managing the application's data and interacting with the database.
* It provides a set of methods to create, read, update, and delete (CRUD) data from the database.
* */
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
