package com.example.dell.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course5);
    }

    public void onClickc5s1(View view) {
        Intent c5s1Intent= new Intent(Course5Activity.this,Course5Sub1Activity.class);
        startActivity(c5s1Intent);
    }
    public void onClickc5s2(View view) {
        Intent c5s2Intent= new Intent(Course5Activity.this,Course5Sub2Activity.class);
        startActivity(c5s2Intent);
    }
    public void onClickc5s3(View view) {
        Intent c5s3Intent= new Intent(Course5Activity.this,Course5Sub3Activity.class);
        startActivity(c5s3Intent);
    }
    public void onClickc5s4(View view) {
        Intent c5s4Intent= new Intent(Course5Activity.this,Course5Sub4Activity.class);
        startActivity(c5s4Intent);
    }
    public void onClickc5s5(View view) {
        Intent c5s5Intent= new Intent(Course5Activity.this,Course5Sub5Activity.class);
        startActivity(c5s5Intent);
    }
}
