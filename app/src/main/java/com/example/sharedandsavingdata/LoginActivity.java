package com.example.sharedandsavingdata;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        button=findViewById(R.id.login);
        button.setOnClickListener(v -> {

            SharedPreferences sharedPreferences= getSharedPreferences("Login",MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferences.edit();
            editor.putBoolean("flag",true);
            editor.apply();
            Intent IHome=new Intent(LoginActivity.this,HomeActivity.class);
            startActivity(IHome);
        });

    }
}