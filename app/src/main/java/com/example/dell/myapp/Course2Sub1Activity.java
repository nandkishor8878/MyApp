package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course2Sub1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course2_sub1);
    }
    public void browserc2s1p(View view) {
        Intent intentc2s1p =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc2s1p);
    }
    public void browserc2s1n(View view) {
        Intent intentc2s1n =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc2s1n);
    }
}
