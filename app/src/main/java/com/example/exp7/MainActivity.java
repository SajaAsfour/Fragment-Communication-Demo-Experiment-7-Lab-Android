package com.example.exp7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements second.communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data)
    {
        second secondFragment = (second) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        secondFragment.changeData(data);
    }
}