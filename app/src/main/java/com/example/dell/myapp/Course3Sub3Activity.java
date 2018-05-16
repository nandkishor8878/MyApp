package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course3Sub3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course3_sub3);
    }
    public void browserc3s3p(View view) {
        Intent intentc3s3p =new Intent(Intent.ACTION_VIEW, Uri.parse("link"));
        startActivity(intentc3s3p);
    }
    public void browserc3s3n(View view) {
        Intent intentc3s3n =new Intent(Intent.ACTION_VIEW, Uri.parse("link"));
        startActivity(intentc3s3n);
    }
}
