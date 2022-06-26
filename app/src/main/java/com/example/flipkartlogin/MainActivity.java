package com.example.flipkartlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signin;
        signin = findViewById(R.id.signin);
        Button signup;
        signup = findViewById(R.id.signup);
        ImageView crossHome;
        crossHome = findViewById(R.id.crossHome);

        Intent Intentsingin, Intentsingup;

        Intentsingin = new Intent(MainActivity.this, welcomeHome.class);
        Intentsingup = new Intent(MainActivity.this, signup.class);

        crossHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Cross clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Please create an account!", Toast.LENGTH_SHORT).show();
                startActivity(Intentsingup);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Signin Successful", Toast.LENGTH_SHORT).show();
                startActivity(Intentsingin);
            }
        });
    }
}
