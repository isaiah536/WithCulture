package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //회원가입
        Button signupbutton = findViewById(R.id.signup);
        signupbutton.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
               startActivity(intent);
           }
        });

        //로그인
        Button loginbutton = findViewById(R.id.button_login);
        loginbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

            }
        });

        //forgot password
        TextView forgotpassword = findViewById(R.id.forgot_password);
        forgotpassword.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

            }
        });
    }
}