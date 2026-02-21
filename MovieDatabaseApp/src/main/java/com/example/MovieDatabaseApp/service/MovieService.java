package com.example.MovieDatabaseApp.service;

import com.example.MovieDatabaseApp.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movies;

    public MovieService() {
        movies = new ArrayList<>();
        movies.add(new Movie());
    }

    // Get list of all movies
    public List<Movie> getMovies() {
        return this.movies = movies;
    }

    // Add a movie
    public void addMovies(Movie movie) {
        this.movies.add(movie);
    }

    // Update
    public void updateMovie(Movie movie) {
    }

    // Delete
    public void removeMovie(int id) {
        this.movies.removeIf(movie -> movie.getId() == id);
    }

}
