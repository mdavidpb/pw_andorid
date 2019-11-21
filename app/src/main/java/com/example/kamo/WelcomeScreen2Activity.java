package com.example.kamo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kamo.ui.login.LoginActivity;

public class WelcomeScreen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen2);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(WelcomeScreen2Activity.this, WelcomeScreen3Activity.class);
        startActivity(intent);
    }

    public void Back(View view) {
        Intent intent = new Intent(WelcomeScreen2Activity.this, WelcomeScreenActivity.class);
        startActivity(intent);
    }
}
