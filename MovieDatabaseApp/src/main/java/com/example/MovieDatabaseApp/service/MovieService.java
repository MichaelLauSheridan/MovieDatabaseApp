// Student Name: Michael Lau
// Student ID : 991769630

package com.example.MovieDatabaseApp.service;

import com.example.MovieDatabaseApp.data.MovieRepo;
import com.example.MovieDatabaseApp.model.Genre;
import com.example.MovieDatabaseApp.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    final private MovieRepo movieRepo;
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    // Search movie
    public List<Movie> search(String title, Genre genre, Double minRating) {
        return movieRepo.search(title, genre, minRating);
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

    // Find by ID
    public Optional<Movie> findById(int id) {
        return movieRepo.findById(id);
    }

    public void deleteById(int id) {
        movieRepo.deleteById(id);
    }
}
