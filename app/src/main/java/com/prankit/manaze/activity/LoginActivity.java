package com.prankit.manaze.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.prankit.manaze.R;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText inputEmail, inputPassword;
    private TextInputLayout emailInputLayout, passwordInputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailInputLayout = findViewById(R.id.inputEmailLayout);
        passwordInputLayout = findViewById(R.id.inputPasswordLayout);
        inputEmail = findViewById(R.id.inputLoginEmail);
        inputPassword = findViewById(R.id.inputLoginPassword);
        TextView signIn = findViewById(R.id.signInTextView);
        TextView forgotPassword = findViewById(R.id.forgetPasswordText);

        inputEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                emailInputLayout.setError(null);
                passwordInputLayout.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        inputPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                passwordInputLayout.setError(null);
                emailInputLayout.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        forgotPassword.setOnClickListener(v -> Toast.makeText(LoginActivity.this, "Not Implemented yet", Toast.LENGTH_SHORT).show());
        signIn.setOnClickListener(v -> login(inputEmail.getText().toString(), inputPassword.getText().toString()));
    }

    private void login(String email, String password) {

        if (email.equals("")) emailInputLayout.setError("Required");
        if (password.equals("")) passwordInputLayout.setError("Required");

        if (!email.equals("") && !password.equals("")) {
            Toast.makeText(LoginActivity.this, "Logging In", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            this.finish();
        }
    }
}