package com.example.a3allmni.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a3allmni.R;

public class SignIn extends AppCompatActivity {

    EditText email_et,password_et;
    TextView Fpassword;
    Button Signin_btn , Signup_btn;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        email_et=findViewById(R.id.signin_email_et);
        password_et=findViewById(R.id.signin_password_et);
        Fpassword = findViewById(R.id.Fpassword_tv);
        Signin_btn=findViewById(R.id.signin_signin_btn);
        Signup_btn=findViewById(R.id.signin_signup_btn);

        Signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


              email= email_et.getText().toString();
              password=password_et.getText().toString();
                Log.d("TEST TSES ****", "onClick: "+email+password);
            }
        });

        Signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SignIn.this, SignUp.class);
                startActivity(i);

                 }
        });


    }
}
