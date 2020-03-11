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

import com.example.a3allmni.MainActivity;
import com.example.a3allmni.R;

public class SignUp extends AppCompatActivity {
    EditText email_et,password_et;
    TextView have_account_tv;
    Button regster_btn ;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        email_et=findViewById(R.id.signup_email_et);
        password_et=findViewById(R.id.signup_password_et);
        have_account_tv = findViewById(R.id.have_tv);
        regster_btn=findViewById(R.id.regster_btn);


        regster_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email= String.valueOf(email_et.getText());
                password=String.valueOf(password_et.getText());
                Log.d("TEST TSES ****", "onClick: "+email+password);
                Toast.makeText(SignUp.this, "adasd", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(SignUp.this, MainActivity.class));


            }
        });





    }
}
