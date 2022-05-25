package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView allAccompany = findViewById(R.id.textView8);
        allAccompany.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,Accompany.class);
                startActivity(intent);
            }
        });

        TextView allCommunity = findViewById(R.id.textView10);
        allCommunity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,CommunityActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onBackPressed() {
        //super.onBackPressed();
    }
}