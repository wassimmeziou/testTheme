package com.example.newtests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView sitchMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
            setTheme(R.style.Theme1);
        else
            setTheme(R.style.Theme2);

        setContentView(R.layout.activity_main);
        sitchMode = findViewById(R.id.sitchMode);

        sitchMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    RestartActivity();
                }else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    RestartActivity();
                }
            }
        });
    }

    private void RestartActivity() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();

    }
}
