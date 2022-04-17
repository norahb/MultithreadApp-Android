package com.example.multithreadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new thread (1) using Runnable interface
        Runnable myRunnable = new MyRunnableClass();
        Thread t1 = new Thread(myRunnable);
        t1.start(); // will call run method in MyRunnableClass class

        // Create thread 2 using thread class
        MyThreadClass t2 = new MyThreadClass();
        t2.start();
    }
}