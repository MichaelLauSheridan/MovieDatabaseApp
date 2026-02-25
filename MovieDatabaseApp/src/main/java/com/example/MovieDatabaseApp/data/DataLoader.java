package com.example.MovieDatabaseApp.data;

import com.example.MovieDatabaseApp.model.Genre;
import com.example.MovieDatabaseApp.model.Movie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(MovieRepo repo) {
        return args -> {

            // Only insert if database is empty (recommended)
            if (repo.count() == 0) {

                repo.save(new Movie(
                        0,
                        "Inception",
                        Genre.SCI_FI,
                        2010,
                        8.8,
                        "Christopher Nolan",
                        148
                ));

                repo.save(new Movie(
                        0,
                        "Titanic",
                        Genre.ROMANCE,
                        1997,
                        7.9,
                        "James Cameron",
                        195
                ));

                repo.save(new Movie(
                        0,
                        "The Dark Knight",
                        Genre.ACTION,
                        2008,
                        9.0,
                        "Christopher Nolan",
                        152
                ));

                repo.save(new Movie(
                        0,
                        "Interstellar",
                        Genre.SCI_FI,
                        2014,
                        8.7,
                        "Christopher Nolan",
                        169
                ));

                repo.save(new Movie(
                        0,
                        "Avengers: Endgame",
                        Genre.ACTION,
                        2019,
                        8.4,
                        "Anthony Russo & Joe Russo",
                        181
                ));

                repo.save(new Movie(
                        0,
                        "The Shawshank Redemption",
                        Genre.DRAMA,
                        1994,
                        9.3,
                        "Frank Darabont",
                        142
                ));

                repo.save(new Movie(
                        0,
                        "Parasite",
                        Genre.THRILLER,
                        2019,
                        8.6,
                        "Bong Joon-ho",
                        132
                ));

                repo.save(new Movie(
                        0,
                        "Frozen",
                        Genre.ANIMATION,
                        2013,
                        7.4,
                        "Chris Buck & Jennifer Lee",
                        102
                ));

                repo.save(new Movie(
                        0,
                        "The Conjuring",
                        Genre.HORROR,
                        2013,
                        7.5,
                        "James Wan",
                        112
                ));

                repo.save(new Movie(
                        0,
                        "La La Land",
                        Genre.MUSICAL,
                        2016,
                        8.0,
                        "Damien Chazelle",
                        128
                ));

                System.out.println("Sample movies loaded!");
            }
        };
    }
}
