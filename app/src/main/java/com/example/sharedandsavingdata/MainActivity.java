package com.example.sharedandsavingdata;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(() -> {
            SharedPreferences sharedPreferences= getSharedPreferences("Login",MODE_PRIVATE);
      boolean check= sharedPreferences.getBoolean("flag",false);
            Intent iNext;
      if(check)
      {
          iNext=new Intent(MainActivity.this,HomeActivity.class);

      }
      else
      {
          iNext=new Intent(MainActivity.this,LoginActivity.class);


      }
      startActivity(iNext);

        },4000);

    }
}