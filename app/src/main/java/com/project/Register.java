package com.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    TextView btn;
    private TextView inputName, inputEmail, inputPassword, inputConfirmPassword;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        btn = findViewById(R.id.alreadyHave);
        inputName = findViewById(R.id.inputName);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputConfirmPassword = findViewById(R.id.inputConfirmPassword);
        registerButton = findViewById(R.id.buttonReg);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCredentials();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });
    }

    private void checkCredentials() {
        String username = inputName.getText().toString();
        String email = inputEmail.getText().toString();
        String password = inputPassword.getText().toString();
        String confirmPassword = inputConfirmPassword.getText().toString();

        if (username.isEmpty() || username.length() < 7) {
            showError((EditText) inputName, "Invalid username");
        }

        if (email.isEmpty() || !email.contains("@")) {
            showError((EditText) inputEmail, "Invalid email");
        }

        if (password.isEmpty()) {
            showError((EditText) inputPassword, "This field cannot be empty");
        }
        if (password.length() < 7 && !password.isEmpty()) {
            showError((EditText) inputPassword, "Password must have at least 7 characters");
        }
        if (!password.contains("@") && !password.contains("#") && !password.contains("%") && !password.contains("_")) {
            showError((EditText) inputPassword, "Password must contain at least one special character: @#%_");
        }
        if (confirmPassword.isEmpty() || !confirmPassword.equals(password)) {
            showError((EditText) inputConfirmPassword, "Password doesn't match");
        }
        else {
            Toast.makeText(this, "OkOK", Toast.LENGTH_SHORT).show();
        }

    }

    private void showError(EditText input, String s) {
        input.setError(s);
        input.requestFocus();

    }
}