package com.example.activitilifecycleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showMessage("onCreate()");
        setContentView(R.layout.activity_second);
        showMessage(getIntent().getStringExtra("data_from-first_activity"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy()");
    }

    private void showMessage(String message) {
        Toast.makeText(this, "SecondActivity: " + message, Toast.LENGTH_LONG).show();
    }
}