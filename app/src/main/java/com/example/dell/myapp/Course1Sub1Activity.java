package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course1Sub1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course1_sub1);
    }
    public void browserc1s1p(View view) {
        Intent intentc1s1p =new Intent(Intent.ACTION_VIEW, Uri.parse("https://1drv.ms/b/s!AgxHsC6Ffal4ay_wEINda51btsk"));
        startActivity(intentc1s1p);
    }
    public void browserc1s1n(View view) {
        Intent intentc1s1n =new Intent(Intent.ACTION_VIEW, Uri.parse("https://1drv.ms/b/s!AgxHsC6Ffal4ay_wEINda51btsk"));
        startActivity(intentc1s1n);
    }
}
