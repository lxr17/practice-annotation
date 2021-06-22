package com.example.practice_annotation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.annotation.annotation.CompileAnnotation;

public class MainActivity extends AppCompatActivity {

    @CompileAnnotation
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}