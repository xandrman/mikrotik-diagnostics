package ru.algoritm55.mikrotikdiagnostics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    public static final String IP_MESSAGE = "IP";
    public static final String LOGIN_MESSAGE = "login";
    public static final String PASSWORD_MESSAGE = "password";

    TextInputLayout editTextIP, editTextLogin, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextIP = findViewById(R.id.outlinedTextFieldIP);
        editTextLogin = findViewById(R.id.outlinedTextFieldLogin);
        editTextPassword = findViewById(R.id.outlinedTextFieldPassword);
        editTextIP.requestFocus();
    }

    public void openShowDataActivity(View view) {
        Intent intent = new Intent(this, ShowDataActivity.class);
        intent.putExtra(IP_MESSAGE, editTextIP.getEditText().getText().toString());
        intent.putExtra(LOGIN_MESSAGE, editTextLogin.getEditText().getText().toString());
        intent.putExtra(PASSWORD_MESSAGE, editTextPassword.getEditText().getText().toString());
        startActivity(intent);
    }
}