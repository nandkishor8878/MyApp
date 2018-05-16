package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course1Sub5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course1_sub5);
    }
    public void browserc1s5p(View view) {
        Intent intentc1s5p =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc1s5p);
    }
    public void browserc1s5n(View view) {
        Intent intentc1s5n =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc1s5n);
    }
}
