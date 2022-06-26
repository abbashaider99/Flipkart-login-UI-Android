package com.example.flipkartlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button signin, signup;
        ImageView crossHome;
        crossHome = findViewById(R.id.crossHome);
        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);

        Intent intentsignin, intentsignup, intentcrossHome;

        intentcrossHome = new Intent(signup.this, MainActivity.class);
        intentsignin = new Intent(signup.this, MainActivity.class);
        intentsignup = new Intent(signup.this, account_created.class);


        crossHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup.this, "Cross pressed, Back to home!", Toast.LENGTH_SHORT).show();
                startActivity(intentcrossHome);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup.this, "Account created successful!", Toast.LENGTH_SHORT).show();
                startActivity(intentsignup);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup.this, "Please sign in", Toast.LENGTH_SHORT).show();
                startActivity(intentsignin);
            }
        });
    }
}