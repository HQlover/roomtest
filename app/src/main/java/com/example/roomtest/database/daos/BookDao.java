package com.example.roomtest.database.daos;

import com.example.roomtest.database.entities.Book;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import io.reactivex.Flowable;

@Dao
public interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    List<Long> insert(Book... books);

    @Query("SELECT * from book")
    Flowable<List<Book>> load();
}
