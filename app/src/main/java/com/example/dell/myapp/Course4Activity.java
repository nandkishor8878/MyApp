package com.example.dell.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course4);
    }

    public void onClickc4s1(View view) {
        Intent c4s1Intent= new Intent(Course4Activity.this,Course4Sub1Activity.class);
        startActivity(c4s1Intent);
    }
    public void onClickc4s2(View view) {
        Intent c4s2Intent= new Intent(Course4Activity.this,Course4Sub2Activity.class);
        startActivity(c4s2Intent);
    }
    public void onClickc4s3(View view) {
        Intent c4s3Intent= new Intent(Course4Activity.this,Course4Sub3Activity.class);
        startActivity(c4s3Intent);
    }
    public void onClickc4s4(View view) {
        Intent c4s4Intent= new Intent(Course4Activity.this,Course4Sub4Activity.class);
        startActivity(c4s4Intent);
    }
    public void onClickc4s5(View view) {
        Intent c4s5Intent= new Intent(Course4Activity.this,Course4Sub5Activity.class);
        startActivity(c4s5Intent);
    }
}
