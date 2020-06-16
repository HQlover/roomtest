package com.example.roomtest.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.example.roomtest.AppApplication;
import com.example.roomtest.database.AppDatabase;

public class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    protected AppDatabase mAppDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAppDatabase=((AppApplication)getApplication()).getAppDatabase();
    }
}