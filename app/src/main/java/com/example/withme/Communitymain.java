package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Communitymain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communitymain);

        ImageView toolbar_home = findViewById(R.id.bar_home);
        toolbar_home.setColorFilter(Color.parseColor("#00404040"));

        TextView cm_enter = (TextView) findViewById(R.id.cm_enter);
        cm_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Communitymain.this, accompanymainActivity.class);
                startActivity(intent);
            }
        });

        TextView accompany = (TextView) findViewById(R.id.accompany);
        accompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Communitymain.this, accompanymainActivity.class);
                startActivity(intent);
            }
        });


        ImageView toolbar_category = findViewById(R.id.bar_category);
        toolbar_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Communitymain.this,Category_1.class);
                startActivity(intent);
            }
        });

        ImageView toolbar_chat = findViewById(R.id.bar_chat);
        toolbar_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Communitymain.this,ChatListActivity.class);
                startActivity(intent);
            }
        });

        ImageView toolbar_profile = findViewById(R.id.bar_profile);
        toolbar_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Communitymain.this,Profile.class);
                startActivity(intent);
            }
        });

    }
    public void onBackPressed() {
        //super.onBackPressed();
    }
}