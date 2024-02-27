package com.example.spring_movies.services;

import com.example.spring_movies.models.Movie;
import com.example.spring_movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        return optionalMovie.orElse(null);
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id){
        movieRepository.deleteMovieById(id);
    }

}
