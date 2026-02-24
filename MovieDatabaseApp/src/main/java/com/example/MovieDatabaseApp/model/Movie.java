package com.example.MovieDatabaseApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String title;
    public String genre;
    public int releaseYear;
    public String director;
    public int durationMinutes;

    public Movie(){}
    public Movie(int id, String title, String genre, int releaseYear, String director, int durationMinutes) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    public int getReleaseYear() {return releaseYear;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}

    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}

    public int getDurationMinutes() {return durationMinutes;}
    public void setDurationMinutes(int durationMinutes) {this.durationMinutes = durationMinutes;}

    // @Override
    // public String toString() {};
}
