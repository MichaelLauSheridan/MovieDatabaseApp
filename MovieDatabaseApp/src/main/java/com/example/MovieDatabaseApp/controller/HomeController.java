package com.example.MovieDatabaseApp.controller;

import com.example.MovieDatabaseApp.model.Genre;
import com.example.MovieDatabaseApp.model.Movie;
import com.example.MovieDatabaseApp.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        model.addAttribute("genres", Genre.values());
        return "add-movie";
    }

    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("movie") Movie movie, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("genres", Genre.values());
            return "add-movie";
        }
        System.out.println(movie.getId());
        System.out.println(movie.getTitle());
        System.out.println(movie.getGenre());
        System.out.println(movie.getReleaseYear());
        System.out.println(movie.getDirector());
        System.out.println(movie.getRating());
        System.out.println(movie.getDurationMinutes());
        System.out.println(movie.toString());
        movieService.save(movie);
        return "redirect:/";
    }

    @GetMapping("/movies")
    public String viewMovies(Model model) {
        model.addAttribute("movies", movieService.findAll());
        return "movie-list";
    }

    @GetMapping("/search")
    public String searchMovies(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) Genre genre,
            @RequestParam(required = false) Double minRating,
            Model model
    ) {
        model.addAttribute("genres", Genre.values());

        // keep the user’s inputs in the form after searching
        model.addAttribute("title", title);
        model.addAttribute("genre", genre);
        model.addAttribute("minRating", minRating);

        model.addAttribute("movies", movieService.search(title, genre, minRating));
        return "search-movie"; // templates/search.html
    }
}
