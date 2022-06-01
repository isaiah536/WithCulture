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

public class Accompany_write2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_accompany_write2);

        state = findViewById(R.id.write1_state);
        id = findViewById(R.id.write_preset_id);
        tag = findViewById(R.id.write_preset_date);
        title = findViewById(R.id.write_preset_tiltle);
        writing = findViewById(R.id.write_preset_writing);

        state.setText("채팅중");
        state.setBackgroundColor(Color.parseColor("#606060"));
        id.setText("dhdhshhs_388");
        tag.setText("6월 4일   서울");
        title.setText("6월 4일에 전시회 같이 가실분?");
        writing.setText("The Color Spot : 꿈속의 자연 같이 보러 가실분 있나요?");

        profileNickname = findViewById(R.id.Preview_Nickname);
        profileAge = findViewById(R.id.Preview_Age);
        profileGender = findViewById(R.id.Preview_Gender);

        //profileNickname.setText("dhdhshhs_338");
        //profileAge.setText("22");
        //profileGender.setText("여성");

        ImageView back2 = findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accompany_write2.this,Accompany.class);
                startActivity(intent);
                state.setBackgroundColor(Color.parseColor("#8da1fe"));
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
                Intent intent = new Intent(Accompany_write2.this,Profile_preview.class);
                startActivity(intent);
            }
        });
    }

    public int getProfile(){
        return 2;
    }
}