// Student Name: Michael Lau
// Student ID : 991769630

package com.example.MovieDatabaseApp.data;

import com.example.MovieDatabaseApp.model.Genre;
import com.example.MovieDatabaseApp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

    @Query("""
        SELECT m FROM Movie m
        WHERE (:title IS NULL OR :title = '' OR LOWER(m.title) LIKE LOWER(CONCAT('%', :title, '%')))
          AND (:genre IS NULL OR m.genre = :genre)
          AND (:minRating IS NULL OR m.rating >= :minRating)
    """)
    List<Movie> search(
            @Param("title") String title,
            @Param("genre") Genre genre,
            @Param("minRating") Double minRating
    );
}
