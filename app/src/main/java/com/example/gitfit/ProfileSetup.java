package com.example.gitfit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileSetup extends AppCompatActivity {

    public static final String name = "NAME";
    public static final String Email = "IForgotMyBabyintheCar@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setup);

        //Action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Profile Setup");
        //Edit Text
        EditText nameET = findViewById(R.id.Name);
        EditText emailET = findViewById(R.id.Email);
        //Button but_continue
        Button saveButton = findViewById(R.id.but_Continue);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get data from edit text
                String name = nameET.getText().toString();
                String email = emailET.getText().toString();
                //intent initiation
                Intent intent = new Intent(ProfileSetup.this, Profile.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
            }
        });
    }
}