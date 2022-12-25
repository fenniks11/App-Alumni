package com.example.appalumni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView keRegister;
    TextView keForgotDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        keRegister = findViewById(R.id.tv_sign_up);
        keForgotDetails = findViewById(R.id.tv_forgot_login_details);

        keRegister.setOnClickListener(view -> {
            Intent i = new Intent(Login.this, Register.class);
            startActivity(i);
        });
        keForgotDetails.setOnClickListener(view -> {
            Intent i = new Intent(Login.this, ForgotPassword.class);
            startActivity(i);
        });
    }
}