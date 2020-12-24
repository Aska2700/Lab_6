package com.example.lab6.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.lab6.model.Photo;

import java.util.List;


@Dao
public interface PhotosDAO {
    @Query("SELECT * FROM Photo")
    List<Photo> loadAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPhoto(Photo photo);

    @Delete
    void deletePhoto(Photo photo);

}
