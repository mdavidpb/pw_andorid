package com.example.kamo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kamo.ui.login.LoginActivity;

public class WelcomeScreen3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen3);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(WelcomeScreen3Activity.this, LoginActivity.class);
        startActivity(intent);
    }
}
