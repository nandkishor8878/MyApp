package com.example.dell.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course3);
    }

    public void onClickc3s1(View view) {
        Intent c3s1Intent= new Intent(Course3Activity.this, Course3Sub1Activity.class);
        startActivity(c3s1Intent);
    }
    public void onClickc3s2(View view) {
        Intent c3s2Intent= new Intent(Course3Activity.this,Course3Sub2Activity.class);
        startActivity(c3s2Intent);
    }
    public void onClickc3s3(View view) {
        Intent c3s3Intent= new Intent(Course3Activity.this,Course3Sub3Activity.class);
        startActivity(c3s3Intent);
    }
    public void onClickc3s4(View view) {
        Intent c3s4Intent= new Intent(Course3Activity.this,Course3Sub4Activity.class);
        startActivity(c3s4Intent);
    }
    public void onClickc3s5(View view) {
        Intent c3s5Intent= new Intent(Course3Activity.this,Course3Sub5Activity.class);
        startActivity(c3s5Intent);
    }
}
