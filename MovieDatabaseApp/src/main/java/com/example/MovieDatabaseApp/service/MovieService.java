package com.example.MovieDatabaseApp.service;

import com.example.MovieDatabaseApp.data.MovieRepo;
import com.example.MovieDatabaseApp.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    final private MovieRepo movieRepo;
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    // Get list of all movies
    public List<Movie> findAll() { return movieRepo.findAll();
    }

    // Add a movie
    public void save(Movie movie) {
        movieRepo.save(movie);
    }

    // Update
    public void updateMovie(Movie movie) {
    }

    // Delete
    public void delete(int id) {
        movieRepo.deleteById(id);
    }
    public Movie getMovie(int id) {
        return null;
    };
}
