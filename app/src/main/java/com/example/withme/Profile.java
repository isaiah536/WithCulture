package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.withme.data.UserInfo;

import java.util.jar.Attributes;

public class Profile extends AppCompatActivity {
UserInfo userInfo;
TextView NicknameP;
TextView NameP;
TextView AgeP;
TextView GenderP;
TextView EmailP;

SignupActivity signupActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        userInfo = new UserInfo();
        NicknameP = findViewById(R.id.Profile_NickName);
        NameP = findViewById(R.id.Profile_Name_set);
        AgeP = findViewById(R.id.Profile_Age_set);
        GenderP = findViewById(R.id.Profile_Gender_set);
        EmailP = findViewById(R.id.Profile_Email_set);

        NicknameP.setText("Seoyoung99");
        NameP.setText("김서영");
        AgeP.setText("25");
        GenderP.setText("여성");
        EmailP.setText("Seoyoung9999@cnu.ac.kr");
        ImageView toolbar_home = findViewById(R.id.bar_home);
        toolbar_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,MainActivity.class);
                startActivity(intent);
            }
        });


        ImageView toolbar_category = findViewById(R.id.bar_category);
        toolbar_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,Category_1.class);
                startActivity(intent);
            }
        });

        ImageView toolbar_chat = findViewById(R.id.bar_chat);
        toolbar_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,ChatListActivity.class);
                startActivity(intent);
            }
        });

        ImageView toolbar_profile = findViewById(R.id.bar_profile);
        toolbar_profile.setColorFilter(Color.parseColor("#00404040"));

    }

}
