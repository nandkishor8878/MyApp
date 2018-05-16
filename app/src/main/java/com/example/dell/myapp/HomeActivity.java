package com.example.dell.myapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
  //Use below hidden code for geting floating button
       // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       // fab.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View view) {
               // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    //    .setAction("Action", null).show();
           // }
      //  });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_logout) {
            // Write logout logic
            FirebaseAuth.getInstance().signOut();
            Intent pIntent =new Intent(HomeActivity.this,ProfileActivity.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            this.startActivity(pIntent);
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent homeIntent=new Intent(HomeActivity.this,HomeActivity.class);
            startActivity(homeIntent);
        }
        else if (id == R.id.nav_bookmark) {
            Intent bookmarkIntent=new Intent(HomeActivity.this,BookmarkActivity.class);
            startActivity(bookmarkIntent);
        }
        else if (id == R.id.nav_setting) {
            Intent settinsfIntent=new Intent(HomeActivity.this,SettingsActivity.class);
            startActivity(settinsfIntent);
        }
        else if (id == R.id.nav_share) {
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT,"Hi   Download this app for notes               " +
                    "https://drive.google.com/a/itbhu.ac.in/file/d/1vCMfqoHMpdPyKMtU29B4-QZF-J7rIE-j/view?usp=sharing");
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent,"Choose app to share"));
        }
        else if (id == R.id.nav_contactus) {
            Intent contactIntent =new Intent(HomeActivity.this,ContactActivity.class);
            startActivity(contactIntent);
        }
        else if (id == R.id.nav_feedback) {
           // Intent feedbackIntent=new Intent(HomeActivity.this,FeedbackActivity.class);
           // startActivity(feedbackIntent);
            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfu5hIiKqEPwa0mF2PoESz6fRkzZUXbp9qF0pdmWxAK0p3a5A/viewform?usp=pp_url&entry.1637372657&entry.1736423016&entry.379194687"));
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClickc1(View view) {
        Intent c1Intent= new Intent(HomeActivity.this,Course1Activity.class);
        startActivity(c1Intent);
    }
    public void onClickc2(View view) {
        Intent c2Intent= new Intent(HomeActivity.this,Course2Activity.class);
        startActivity(c2Intent);
    }
    public void onClickc3(View view) {
        Intent c3Intent= new Intent(HomeActivity.this,Course3Activity.class);
        startActivity(c3Intent);
    }
    public void onClickc4(View view) {
        Intent c4Intent= new Intent(HomeActivity.this,Course4Activity.class);
        startActivity(c4Intent);
    }
    public void onClickc5(View view) {
        Intent c5Intent= new Intent(HomeActivity.this,Course5Activity.class);
        startActivity(c5Intent);
    }

    public void SearchInbox(){

    }
}
