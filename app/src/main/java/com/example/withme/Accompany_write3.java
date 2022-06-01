package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Accompany_write3 extends AppCompatActivity {
    ImageView preset_profile;
    ImageView back;
    Button state;
    TextView id;
    TextView title;
    TextView writing;
    TextView tag;

    TextView profileNickname;
    TextView profileAge;
    TextView profileGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accompany_write3);

        state = findViewById(R.id.write1_state);
        id = findViewById(R.id.write_preset_id);
        tag = findViewById(R.id.write_preset_date);
        title = findViewById(R.id.write_preset_tiltle);
        writing = findViewById(R.id.write_preset_writing);

        state.setText("채팅중");
        state.setBackgroundColor(Color.parseColor("#4E6DFF"));
        id.setText("isaiah_yeohs");
        tag.setText("X월 X일   대전   활동적인 사람");
        title.setText("XX콘서트 막콘 동행 구해요!!");
        writing.setText("xx콘 막콘 동행 구해요 콘서트 하기 전에 돌아다니면서 \n"+ "같이 나눔 받으실 분이면 더 좋을 것 같아요!!");

        profileNickname = findViewById(R.id.Preview_Nickname);
        profileAge = findViewById(R.id.Preview_Age);
        profileGender = findViewById(R.id.Preview_Gender);

        //profileNickname.setText("isaiah_yeohs");
        //profileAge.setText("21");
        //profileGender.setText("남성");

        ImageView back2 = findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany_write3.this,Accompany.class);
                startActivity(intent);
            }
        });

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        layoutParams.dimAmount = 0.8f;
        getWindow().setAttributes(layoutParams);

        preset_profile = findViewById(R.id.write_preset_profile);
        preset_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany_write3.this,Profile_preview.class);
                startActivity(intent);
            }
        });
    }

    public int getProfile(){
        return 3;
    }
}