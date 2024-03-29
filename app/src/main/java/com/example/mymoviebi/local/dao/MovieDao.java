package com.example.mymoviebi.local.dao;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.mymoviebi.modul.MovieResponse;

import java.util.List;

@Dao
public interface MovieDao {

    //Movie
    @Insert
    void insertMovie(MovieResponse.ResultsBean movie);

    @Insert
    long insertId(MovieResponse.ResultsBean movie);

    @Update
    int updateMovie(MovieResponse.ResultsBean movie);

    @Query("SELECT * FROM movie")
    List<MovieResponse.ResultsBean> getAllMovies();

    @Query("SELECT * FROM movie")
    Cursor getAll();

    @Query("SELECT * FROM movie WHERE id = :id")
    Cursor selectById(long id);

    @Query("SELECT COUNT(*) FROM movie WHERE id = :id")
    int countMovieById(int id);

    @Query("DELETE FROM movie WHERE id = :id")
    void deleteMovie(int id);

    @Query("DELETE FROM movie WHERE id = :id")
    int deleteMovieById(long id);
}
