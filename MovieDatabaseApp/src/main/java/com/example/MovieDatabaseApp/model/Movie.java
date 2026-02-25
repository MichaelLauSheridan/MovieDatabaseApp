// Student Name: Michael Lau
// Student ID : 991769630

package com.example.MovieDatabaseApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Title is required")
    private String title;
    @NotNull(message = "Genre is required")
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @NotNull(message = "Release year is required")
    @Min(value = 1888, message = "Year must be greater than 1888")
    @Max(value = 2027, message = "Year must be less than 2027")
    private int releaseYear;
    @NotNull(message = "Rating is required")
    @DecimalMin(value = "0.0", message = "Rating must be at least 0")
    @DecimalMax(value = "10.0", message = "Rating must be at most 10")
    private double rating;
    @NotBlank(message = "Director is required")
    private String director;
    @NotNull(message = "Duration is required")
    @Min(value = 41, message = "A movie must be great than 40 minutes according to Academy of Motion Picture Arts and Sciences (Oscars)")
    private int durationMinutes;

    public Movie(){}
    public Movie(int id, String title, Genre genre, int releaseYear, double rating, String director, int durationMinutes) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public Genre getGenre() {return genre;}
    public void setGenre(Genre genre) {this.genre = genre;}

    public int getReleaseYear() {return releaseYear;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}

    public double  getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}

    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}

    public int getDurationMinutes() {return durationMinutes;}
    public void setDurationMinutes(int durationMinutes) {this.durationMinutes = durationMinutes;}

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", director='" + director + '\'' +
                ", durationMinutes=" + durationMinutes +
                '}';
    }
}
