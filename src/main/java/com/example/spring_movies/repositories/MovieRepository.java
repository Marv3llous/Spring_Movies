package com.example.spring_movies.repositories;

import com.example.spring_movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    void deleteMovieById(Long id);
}

