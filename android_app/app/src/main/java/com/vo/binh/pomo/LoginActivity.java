package com.vo.binh.pomo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {
    private Button mLogInButton;
    private Button mSignUpButton;
    private ImageView mLogInImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLogInButton = findViewById(R.id.login_button);
        mLogInImageView= findViewById(R.id.log_in_image);
        mSignUpButton = findViewById(R.id.signup_button);

        Glide.with(this).load(R.drawable.pomodoro_grow).into(mLogInImageView);

        mLogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogIn();
            }
        });

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById()

    }

    public void LogIn() {
        Intent menuActivity = new Intent(this, MainActivity.class);
        startActivity(menuActivity);
    }
}
