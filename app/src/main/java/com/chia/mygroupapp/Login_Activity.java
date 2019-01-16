package com.chia.mygroupapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Login_Activity extends AppCompatActivity {

    EditText etAccount;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        handleViews();

    }

    private void handleViews() {
        etAccount = findViewById(R.id.etAccount);
        etPassword =findViewById(R.id.etPassword);
    }


    public void onLogInClick(View view) {
        Intent loginIntent = new Intent(this, MainActivity.class);
        startActivityForResult(loginIntent,0);
    }

    public void onIgnoreClick(View view) {
        Intent loginIntent = new Intent(this, MainActivity.class);
        startActivityForResult(loginIntent,0);
    }
}
