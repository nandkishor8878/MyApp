package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course3Sub5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course3_sub5);
    }
    public void browserc3s5p(View view) {
        Intent intentc3s5p =new Intent(Intent.ACTION_VIEW, Uri.parse("link"));
        startActivity(intentc3s5p);
    }
    public void browserc3s5n(View view) {
        Intent intentc3s5n =new Intent(Intent.ACTION_VIEW, Uri.parse("link"));
        startActivity(intentc3s5n);
    }
}
