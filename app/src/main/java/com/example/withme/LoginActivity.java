package com.example.withme;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.withme.data.UserInfo;

public class LoginActivity extends AppCompatActivity {
    private Handler handler;
    EditText Email;
    EditText Password;
    UserInfo userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = findViewById(R.id.editTextTextEmailAddress);
        Password = findViewById(R.id.editTextTextPassword);
        userInfo = new UserInfo();


        //회원가입
        Button signupbutton = findViewById(R.id.signup);
        signupbutton.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
               startActivity(intent);
           }
        });

        //로그인
        Button loginbutton = findViewById(R.id.button_login);
        loginbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String EmailInfo = Email.getText().toString();
                String PasswordInfo = Password.getText().toString();

                if(!(EmailInfo.equals("")||PasswordInfo.equals(""))){
                    if(userInfo.login("1","0")){
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                    }else{
                        Toast toast = Toast.makeText(getApplicationContext(),"가입정보가 일치하지 않습니다.",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),"로그인 정보를 입력해 주세요",Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        //forgot password
        TextView forgotpassword = findViewById(R.id.forgot_password);
        forgotpassword.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

            }
        });
    }
}