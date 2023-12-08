package com.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView btn;
    private TextView inputEmail2, inputPassword2;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = findViewById(R.id.signUp);
        inputEmail2 = findViewById(R.id.inputEmail2);
        inputPassword2 = findViewById(R.id.inputPassword2);
        loginButton = findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCredentials();
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });
    }
    private void checkCredentials(){
        String email = inputEmail2.getText().toString();
        String password = inputPassword2.getText().toString();

        if(email.isEmpty() || !email.contains("@")){
            showError((TextView)inputEmail2, "Invalid email");
        }
        if(password.isEmpty())
            showError((TextView)inputPassword2, "This field cannot be empty");
        else{
            Toast.makeText(this, "OkOK", Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(TextView input, String s){
        input.setError(s);
        input.requestFocus();
    }
}