package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course2Sub2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course2_sub2);
    }
    public void browserc2s2p(View view) {
        Intent intentc2s2p =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc2s2p);
    }
    public void browserc2s2n(View view) {
        Intent intentc2s2n =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
        startActivity(intentc2s2n);
    }
}
