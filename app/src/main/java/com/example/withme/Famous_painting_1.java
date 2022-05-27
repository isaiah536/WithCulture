package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Famous_painting_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famouos_painting_1);


        ImageView toolbar_home = findViewById(R.id.bar_home);
        toolbar_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_painting_1.this,MainActivity.class);
                startActivity(intent);
            }
        });


        ImageView toolbar_category = findViewById(R.id.bar_category);
        toolbar_category.setColorFilter(Color.parseColor("#00404040"));


        ImageView toolbar_chat = findViewById(R.id.bar_chat);
        toolbar_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_painting_1.this,ChatListActivity.class);
                startActivity(intent);
            }
        });


        ImageView toolbar_profile = findViewById(R.id.bar_profile);
        toolbar_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_painting_1.this,Profile.class);
                startActivity(intent);
            }
        });

        Button back = findViewById(R.id.button9);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_painting_1.this,Category_2.class);
                startActivity(intent);
            }
        });

        ImageView gotoInfo = findViewById(R.id.imageView35);
        gotoInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_painting_1.this,Information.class);
                startActivity(intent);
            }
        });
        ImageView gotoInfo1 = findViewById(R.id.imageView39);
        gotoInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_painting_1.this,Information.class);
                startActivity(intent);
            }
        });
        ImageView gotoInfo2 = findViewById(R.id.imageView43);
        gotoInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Famous_painting_1.this,Information.class);
                startActivity(intent);
            }
        });

    }

}