package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.withme.data.UserInfo;

public class Profile extends AppCompatActivity {
UserInfo userInfo;
SignupActivity signupActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        userInfo = new UserInfo();

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
    public void setProfile(String s){
        TextView NickNameSet = findViewById(R.id.Profile_NickName);
        TextView NameSet = findViewById(R.id.Profile_Name_set);
        TextView BirthSet = findViewById(R.id.Profile_Age_set);
        TextView GenderSet = findViewById(R.id.Profile_Gender_set);
        TextView EmailSet = findViewById(R.id.Profile_Email_set);
        TextView PasswordSet = findViewById(R.id.Profile_Password_set);
        String [] temp = s.split("=");
        NickNameSet.setText(temp[2]);
        NameSet.setText(temp[3]);
        BirthSet.setText(temp[4]);
        GenderSet.setText(temp[6]);
        EmailSet.setText(temp[0]);
        PasswordSet.setText(temp[1]);
    }

}
