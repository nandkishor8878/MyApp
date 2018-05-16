package com.example.dell.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Course2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course2);
    }

    public void onClickc2s1(View view) {
        Intent c2s1Intent= new Intent(Course2Activity.this,Course2Sub1Activity.class);
        startActivity(c2s1Intent);
    }
    public void onClickc2s2(View view) {
        Intent c2s2Intent= new Intent(Course2Activity.this,Course2Sub2Activity.class);
        startActivity(c2s2Intent);
    }
    public void onClickc2s3(View view) {
        Intent c2s3Intent= new Intent(Course2Activity.this,Course2Sub3Activity.class);
        startActivity(c2s3Intent);
    }
    public void onClickc2s4(View view) {
        Intent c2s4Intent= new Intent(Course2Activity.this,Course2Sub4Activity.class);
        startActivity(c2s4Intent);
    }
    public void onClickc2s5(View view) {
        Intent c2s5Intent= new Intent(Course2Activity.this,Course2Sub5Activity.class);
        startActivity(c2s5Intent);
    }
}
