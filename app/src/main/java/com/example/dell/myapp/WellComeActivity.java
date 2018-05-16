package com.example.dell.myapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class WellComeActivity extends AppCompatActivity {
  private static int SPLASH_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         requestWindowFeature(Window.FEATURE_NO_TITLE);
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_well_come);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent wellcomeIntent=new Intent(WellComeActivity.this,ProfileActivity.class);
                startActivity(wellcomeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}
