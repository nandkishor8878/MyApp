package com.example.dell.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SubMenu;
import android.view.View;

public class Course1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course1);
    }

    public void onClickc1s1(View view) {
        Intent c1s1Intent= new Intent(Course1Activity.this,Course1Sub1Activity.class);
        startActivity(c1s1Intent);
    }
    public void onClickc1s2(View view) {
        Intent c1s2Intent= new Intent(Course1Activity.this,Course1Sub2Activity.class);
        startActivity(c1s2Intent);
    }
    public void onClickc1s3(View view) {
        Intent c1s3Intent= new Intent(Course1Activity.this,Course1Sub3Activity.class);
        startActivity(c1s3Intent);
    }
    public void onClickc1s4(View view) {
        Intent c1s4Intent= new Intent(Course1Activity.this,Course1Sub4Activity.class);
        startActivity(c1s4Intent);
    }
    public void onClickc1s5(View view) {
        Intent c1s5Intent= new Intent(Course1Activity.this,Course1Sub5Activity.class);
        startActivity(c1s5Intent);
    }
}
