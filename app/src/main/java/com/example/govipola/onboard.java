package com.example.govipola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class onboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        ImageView img = (ImageView) findViewById(R.id.startBtn);
        img.setOnClickListener(v -> openActivity());

    }

    public void openActivity(){
        Intent intent = new Intent (this, Login.class);
        startActivity(intent);
    }
}