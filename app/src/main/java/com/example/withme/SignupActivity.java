package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.Toast;

import com.example.withme.data.UserInfo;

import java.util.Random;


public class SignupActivity extends AppCompatActivity {
    EditText Email;
    EditText Password;
    EditText Nickname;
    EditText Name;
    EditText Birth;
    EditText Phone;
    EditText Certificate;
    UserInfo userInfo;
    CheckBox male;
    CheckBox female;
    boolean duplicateTest;//
    boolean gender;//
    boolean nicknameB = false;
    boolean nameB = false;
    boolean birthB = false;
    boolean certificated = false;//
    boolean emailconfirm = false;//
    boolean passwordB = false;//
    Profile profile;
    String Isgender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Email = findViewById(R.id.editTextTextEmailAddress2);
        Password = findViewById(R.id.editTextTextPassword2);
        Nickname = findViewById(R.id.editTextTextPersonName);
        Name = findViewById(R.id.editTextTextPersonName2);
        Birth = findViewById(R.id.editTextNumber);
        Phone = findViewById(R.id.editTextPhone);
        Certificate = findViewById(R.id.certificate_number);
        //test
        userInfo = new UserInfo();
        info info = new info();

        duplicateTest = false;
        gender = false;

        //남성
        male = findViewById(R.id.checkBox);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(female.isChecked()){
                    female.setChecked(false);
                    male.setChecked(true);
                }else{
                    male.setChecked(true);
                }
                gender = true;
                Isgender="남성";
            }
        });

        //여성
        female = findViewById(R.id.checkBox2);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(male.isChecked()) {
                    male.setChecked(false);
                    female.setChecked(true);
                }else{
                    female.setChecked(true);
                }
                gender = true;
                Isgender = "여성";
            }
        });

        //가입
        Button certificatebutton = findViewById(R.id.certificate_button);
        certificatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Email = findViewById(R.id.editTextTextEmailAddress2);
                Password = findViewById(R.id.editTextTextPassword2);
                Nickname = findViewById(R.id.editTextTextPersonName);
                Name = findViewById(R.id.editTextTextPersonName2);
                Birth = findViewById(R.id.editTextNumber);
                Phone = findViewById(R.id.editTextPhone);
                Certificate = findViewById(R.id.certificate_number);

                if(Nickname.getText().toString().equals("")){
                    nicknameB = false;
                }else{
                    nicknameB = true;
                }
                if(Name.getText().toString().equals("")){
                    nameB = false;
                }else{
                    nameB = true;
                }
                if(Birth.getText().toString().equals("")){
                    birthB = false;
                }else{
                    birthB = true;
                }
                if(Password.getText().toString().equals("")){
                    passwordB = false;
                }else{
                    passwordB = true;
                }


                if(emailconfirm&&gender&&nicknameB&&nameB&&birthB&&emailconfirm&&certificated&&passwordB){
                    Toast toast = Toast.makeText(getApplicationContext(),"가입되었습니다.",Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(SignupActivity.this,MainActivity.class);
                    startActivity(intent);
                    String tmp = Email.getText().toString()+"="+Password.getText().toString()+"="+Nickname.getText().toString()
                            +"="+Name.getText().toString()+"="+Birth.getText().toString()+"="+Phone.getText().toString()+"="+Isgender;
                    userInfo.addAll(tmp);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),"모두 입력해 주세요.",Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        //백버튼
        ImageView back5 = findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        //중복확인버튼
        Button button_confirm = findViewById(R.id.button2);
        button_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Email.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"이메일을 입력해 주세요.",Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    if(info.isduplication(Email.getText().toString())){
                        System.out.println("false");
                        duplicateTest = false;
                        Toast toast = Toast.makeText(getApplicationContext(),"이미 사용중인 이메일 입니다.",Toast.LENGTH_SHORT);
                        toast.show();
                        emailconfirm = false;

                    }else{
                        System.out.println("true");
                        duplicateTest = true;
                        Toast toast = Toast.makeText(getApplicationContext(),"사용가능한 이메일 입니다.",Toast.LENGTH_SHORT);
                        toast.show();
                        emailconfirm = true;
                    }
                }

            }
        });
        //인증번호 전송
        Button button_propagation = findViewById(R.id.button);
        button_propagation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Phone.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"전화번호를 입력해주세요.",Toast.LENGTH_SHORT);
                    toast.show();
                    certificated = false;
                }else{
                    Random random = new Random();
                    int number = random.nextInt(100000000)+random.nextInt(1000000)+1010101;
                    Certificate.setText(Integer.toString(number));
                    certificated = true;
                }

            }
        });
    }


    private class info{
        private boolean isduplication(String s){
            if(userInfo.findEmail(s)){
                return true;
            }else{
                return false;
            }
        }
    }
}
