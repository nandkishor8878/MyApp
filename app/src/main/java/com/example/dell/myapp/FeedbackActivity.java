package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
    public void onclickfeedback(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfu5hIiKqEPwa0mF2PoESz6fRkzZUXbp9qF0pdmWxAK0p3a5A/viewform?usp=pp_url&entry.1637372657&entry.1736423016&entry.379194687"));
        startActivity(i);
    }
}
