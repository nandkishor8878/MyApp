package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course4Sub2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course4_sub2);
    }
    public void browserc4s2p(View view) {
        Intent intentc4s2p =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc4s2p);
    }
    public void browserc4s2n(View view) {
        Intent intentc4s2n =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc4s2n);
    }
}
