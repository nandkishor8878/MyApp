package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course5Sub3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course5_sub3);
    }
    public void browserc5s3p(View view) {
        Intent intentc5s3p =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc5s3p);
    }
    public void browserc5s3n(View view) {
        Intent intentc5s3n =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc5s3n);
    }
}
