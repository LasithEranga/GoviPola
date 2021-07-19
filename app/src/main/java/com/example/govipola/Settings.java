package com.example.govipola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ImageView settingsBtn = (ImageView) findViewById(R.id.settingsBtn);
        settingsBtn.setOnClickListener(v->settingsClick());
    }
    private  void  settingsClick(){
        onBackPressed();
    }
}