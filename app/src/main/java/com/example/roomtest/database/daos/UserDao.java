package com.example.roomtest.database.daos;

import com.example.roomtest.database.entities.Book;
import com.example.roomtest.database.entities.User;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import io.reactivex.Flowable;

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    List<Long> insert(User... users);

    @Query("SELECT * from user")
    Flowable<List<User>> loadUser();

}
