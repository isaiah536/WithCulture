package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Accompany_write1 extends AppCompatActivity {
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
        setContentView(R.layout.activity_accompany_write1);

        back = findViewById(R.id.back2);
        state = findViewById(R.id.write1_state);
        id = findViewById(R.id.write_preset_id);
        tag = findViewById(R.id.write_preset_date);
        title = findViewById(R.id.write_preset_tiltle);
        writing = findViewById(R.id.write_preset_writing);

        id.setText("y.minzl");
        tag.setText("6월 20일   서울");
        title.setText("팀버튼 특별전 동행 구해요");
        writing.setText("동대문디자인플라자에서 하는 팀 버튼 특별전 6월 20일에 \n같이 가실 분 있나요?");

        profileNickname = findViewById(R.id.Preview_Nickname);
        profileAge = findViewById(R.id.Preview_Age);
        profileGender = findViewById(R.id.Preview_Gender);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany_write1.this,Accompany.class);
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
                Intent intent = new Intent(Accompany_write1.this,Profile_preview.class);
                startActivity(intent);
                //profileNickname.setText("Y.minzl");
                //profileAge.setText("21");
                //profileGender.setText("여성");
            }
        });

        ImageView back2 = findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany_write1.this,Accompany.class);
                intent.putExtra("프로필",1);
                startActivity(intent);
            }
        });


    }

    public int getProfile(){
        return 1;
    }

}