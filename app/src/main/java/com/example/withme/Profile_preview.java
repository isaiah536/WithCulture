package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile_preview extends AppCompatActivity {
    ImageView back;
    TextView profileNickname;
    TextView profileAge;
    TextView profileGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_preview);

        profileNickname = findViewById(R.id.Preview_Nickname);
        profileAge = findViewById(R.id.Preview_Age);
        profileGender = findViewById(R.id.Preview_Gender);

        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = (int) (display.getWidth() * 0.9); //Display 사이즈의 90% 각자 원하는 사이즈로 설정하여 사용
        int height = (int) (display.getHeight() * 0.7);  //Display 사이즈의 90% 각자 원하는 사이즈로 설정하여 사용
        getWindow().getAttributes().width = width;
        getWindow().getAttributes().height = height;
        back = findViewById(R.id.back6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        String write_num = intent.getStringExtra("write");
        if(write_num.equals("1")){
            profileNickname.setText("Y.minzl");
            profileAge.setText("21");
            profileGender.setText("여성");
        }else if(write_num.equals("2")){
            profileNickname.setText("dhdhshhs_338");
            profileAge.setText("22");
            profileGender.setText("여성");
        }else if(write_num.equals("3")){
            profileNickname.setText("isaiah_yeohs");
            profileAge.setText("21");
            profileGender.setText("남성");
        }
    }

    public boolean onTouchEvent(MotionEvent event){
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }
/*
    public void onBackPressed(){
        return;
    }

 */
}