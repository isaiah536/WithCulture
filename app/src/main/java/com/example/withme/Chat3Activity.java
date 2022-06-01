package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Chat3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat3);

        Button close = (Button) findViewById(R.id.close_btn);
        close.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat3Activity.this, Chat2Activity.class);
                startActivity(intent);
            }
        });
        ImageView back = findViewById(R.id.backchat3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chat3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button combutton = findViewById(R.id.com_btn);
        combutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chat3Activity.this,Evaluation.class);
                startActivity(intent);
            }
        });
    }
}
