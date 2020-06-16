package com.example.roomtest.database;

import com.example.roomtest.database.daos.BookDao;
import com.example.roomtest.database.daos.UserDao;
import com.example.roomtest.database.entities.Book;
import com.example.roomtest.database.entities.User;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {User.class, Book.class},version = 3)
@TypeConverters(Converters.class)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();

    public abstract BookDao bookDao();
}
