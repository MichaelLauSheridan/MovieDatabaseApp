package com.example.MovieDatabaseApp.controller;

import com.example.MovieDatabaseApp.model.Movie;
import com.example.MovieDatabaseApp.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    MovieService movieService;

    public HomeController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/") // localhost:8080/
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Movie Database App!");

        return "index";
    }

    @GetMapping("/add")
    public String addMovie(Model model) {
        model.addAttribute("movie", new Movie());
        return "add-movie";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Movie movie) {
        movieService.save(movie);
        return "redirect:/";
    }

    @GetMapping("/movies")
    public String viewMovies(Model model) {
        model.addAttribute("movies", movieService.findAll());
        return "movie-list";
    }
}
