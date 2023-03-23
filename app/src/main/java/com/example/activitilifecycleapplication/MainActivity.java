package com.example.activitilifecycleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage("onCreate()");

        findViewById(R.id.nextActivityButton)
                .setOnClickListener(
                        v -> {
                            Intent nextActivityIntent = new Intent(
                                    getApplicationContext(),
                                    SecondActivity.class
                            );

                            nextActivityIntent
                                    .putExtra("data_from-first_activity", "* was forwarded from first activity");

                            startActivity(nextActivityIntent);
                        }
                );

        findViewById(R.id.openYoutubeButton)
                .setOnClickListener(
                        v -> {
                            Intent openYoutubeIntent = new Intent(Intent.ACTION_VIEW);
                            openYoutubeIntent.setData(Uri.parse("https://www.youtube.com/"));

                            startActivity(openYoutubeIntent);
                        }
                );
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
        Toast.makeText(this, "MainActivity: " + message, Toast.LENGTH_LONG).show();
    }
}