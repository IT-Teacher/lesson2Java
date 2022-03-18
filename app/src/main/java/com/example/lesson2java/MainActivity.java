package com.example.lesson2java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,SecondActivity.class);

        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        Button send = findViewById(R.id.send);

        send.setOnClickListener(view -> {
            intent.putExtra("name",name.getText().toString());
            intent.putExtra("age",age.getText().toString());

            startActivity(intent);
        });
    }
}