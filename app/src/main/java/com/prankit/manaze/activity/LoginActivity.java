package com.prankit.manaze.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.prankit.manaze.R;

public class LoginActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        startActivity(new Intent(this, MainActivity.class));
        finish();

        inputEmail = findViewById(R.id.inputLoginEmail);
        inputPassword = findViewById(R.id.inputLoginPassword);
        TextView signIn = findViewById(R.id.signInTextView);
        TextView forgotPassword = findViewById(R.id.forgetPasswordText);

        forgotPassword.setOnClickListener(v -> Toast.makeText(LoginActivity.this, "Not Implemented yet", Toast.LENGTH_SHORT).show());
        signIn.setOnClickListener(v -> login(inputEmail.getText().toString(), inputPassword.getText().toString()));
    }

    private void login(String email, String password) {
        if (email.equals("")) inputEmail.setError("Required");
        if (password.equals("")) inputPassword.setError("Required");
        if (!email.equals("") && !password.equals("")){
            Toast.makeText(LoginActivity.this, "Logging In", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            this.finish();
        }
    }
}