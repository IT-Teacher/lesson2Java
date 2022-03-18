package com.example.lesson2java;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView res = findViewById(R.id.res);

        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");

        res.setText(name+ " "+age);
    }
}
