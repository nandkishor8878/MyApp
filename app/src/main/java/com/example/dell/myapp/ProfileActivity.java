package com.example.dell.myapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends Activity {

    private EditText inputregisteremail;
    private EditText inputregisterpassword;
    private Button signupbutton;
    private EditText inputloginemail;
    private EditText inputloginpassword;
    private Button loginbutton;

    private FirebaseAuth firebaseAuthregister;
    private FirebaseAuth firebaseAuthlogin;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setupUIViews();

        firebaseAuthregister=FirebaseAuth.getInstance();
        firebaseAuthlogin=FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);

        FirebaseUser user=firebaseAuthlogin.getCurrentUser();

        if (user!=null){
            finish();
            //start new activity
            Intent homeIntent =new Intent(ProfileActivity.this,HomeActivity.class);
            startActivity(homeIntent);
        }


        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(signupvalidate()){
                    progressDialog.setMessage("Please Wait...");
                    progressDialog.show();
                    //update data in data base
                    String register_email=inputregisteremail.getText().toString().trim();
                    String register_password=inputregisterpassword.getText().toString().trim();

                    firebaseAuthregister.createUserWithEmailAndPassword(register_email,register_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                progressDialog.dismiss();
                                Toast.makeText(ProfileActivity.this,"Registration Successful", Toast.LENGTH_LONG).show();
                                //go to home activity
                                Intent homeIntent =new Intent(ProfileActivity.this,HomeActivity.class);
                                startActivity(homeIntent);
                            }
                            else {
                                progressDialog.dismiss();
                                Toast.makeText(ProfileActivity.this,"Please try again", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(loginvalidate()){
                    progressDialog.setMessage("Please Wait...");
                    progressDialog.show();
                    //update data in data base
                    String login_email=inputloginemail.getText().toString().trim();
                    String login_password=inputloginpassword.getText().toString().trim();
                    firebaseAuthlogin.signInWithEmailAndPassword(login_email,login_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                progressDialog.dismiss();
                                Toast.makeText(ProfileActivity.this,"Log In Successful", Toast.LENGTH_LONG).show();
                                //go to home activity
                                Intent homeIntent =new Intent(ProfileActivity.this,HomeActivity.class);
                                startActivity(homeIntent);
                            }
                            else {
                                progressDialog.dismiss();
                                Toast.makeText(ProfileActivity.this,"Please try again", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });

    }

    private void setupUIViews(){
        inputregisteremail=(EditText)findViewById(R.id.editText5);
        inputregisterpassword=(EditText)findViewById(R.id.editText6);
        signupbutton=(Button)findViewById(R.id.button3);
        inputloginemail=(EditText)findViewById(R.id.editText7);
        inputloginpassword=(EditText)findViewById(R.id.editText8);
        loginbutton=(Button)findViewById(R.id.button4);

    }
    private Boolean signupvalidate(){
        Boolean result=false;
        String registeremail=inputregisteremail.getText().toString();
        String registerPassword=inputregisterpassword.getText().toString();
        if(registeremail.isEmpty()&&registerPassword.isEmpty()){
            Toast.makeText(this,"Please Enter all field....", Toast.LENGTH_LONG).show();
        }
        if(registerPassword.length()<6){
            Toast.makeText(this,"Password should be at least 6 characters", Toast.LENGTH_LONG).show();
        }
        else {
            result=true;
        }
        return result;
    }
    private Boolean loginvalidate(){
        Boolean result=false;
        String loginemail=inputloginemail.getText().toString();
        String loginpassword=inputloginpassword.getText().toString();
        if(loginemail.isEmpty()&&loginpassword.isEmpty()){
            Toast.makeText(this,"Please Enter all field....", Toast.LENGTH_LONG).show();
        }
        else {
            result=true;
        }
        return result;
    }
}