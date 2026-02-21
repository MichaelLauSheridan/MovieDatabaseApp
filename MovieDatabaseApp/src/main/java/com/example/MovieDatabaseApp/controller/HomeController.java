package com.example.MovieDatabaseApp.controller;

import com.example.MovieDatabaseApp.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
