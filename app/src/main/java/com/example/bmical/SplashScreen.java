package com.example.bmical;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);






        new Handler().postDelayed(new Runnable( ) {
            @Override
            public void run() {
                Intent iNext = new Intent(SplashScreen.this,MainActivity.class);

                startActivity(iNext);
                finish();
            }
        },4000);



    }
}