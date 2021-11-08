package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "OnCreate Invoked", Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(MainActivity.this, "OnStart Invoked", Toast.LENGTH_SHORT)
                .show();

    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this, "OnPause Invoked", Toast.LENGTH_SHORT)
                .show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "OnResume Invoked", Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "OnStop Invoked", Toast.LENGTH_SHORT)
                .show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "OnRestart Invoked", Toast.LENGTH_SHORT)
                .show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "OnDestroy Invoked", Toast.LENGTH_SHORT)
                .show();
    }
}