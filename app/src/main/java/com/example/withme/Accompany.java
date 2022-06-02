package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Accompany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accompany);

        Button write1_button = findViewById(R.id.write1_button);
        write1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany.this,Accompany_write1.class);
                intent.putExtra("type","1");
                startActivity(intent);
            }
        });

        Button write2_button = findViewById(R.id.write2_button);
        write2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany.this,Accompany_write2.class);
                startActivity(intent);
            }
        });

        Button write3_button = findViewById(R.id.write3_button);
        write3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany.this,Accompany_write3.class);
                startActivity(intent);
            }
        });

        ImageView back4 = findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton writeAccompany = findViewById(R.id.writeAccompany);
        writeAccompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany.this,Accompany_new_write.class);
                startActivity(intent);
            }
        });
    }
}