package com.example.sharedandsavingdata;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button=findViewById(R.id.logout);
        button.setOnClickListener(v -> {
            SharedPreferences sharedPreferences= getSharedPreferences("Login",MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferences.edit();
            editor.putBoolean("flag",false);
            editor.apply();
        });

    }
}