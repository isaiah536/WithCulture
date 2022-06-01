package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChatListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatllist);

        ImageView back = findViewById(R.id.backchatlist);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button accept = (Button) findViewById(R.id.chat1accept);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatListActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });


        ImageView toolbar_home = findViewById(R.id.bar_home);
        toolbar_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatListActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



        ImageView toolbar_category = findViewById(R.id.bar_category);
        toolbar_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatListActivity.this,Category_1.class);
                startActivity(intent);
            }
        });

        ImageView toolbar_chat = findViewById(R.id.bar_chat);
        toolbar_chat.setColorFilter(Color.parseColor("#00404040"));

        ImageView toolbar_profile = findViewById(R.id.bar_profile);
        toolbar_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatListActivity.this,Profile.class);
                startActivity(intent);
            }
        });


    }
}
