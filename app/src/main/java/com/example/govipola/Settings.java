package com.example.govipola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Insets;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ImageView settingsBtn = (ImageView) findViewById(R.id.settingsBtn);
        settingsBtn.setOnClickListener(v->settingsClick());
        TextView language = (TextView) findViewById(R.id.language);
        language.setOnClickListener(v->languagePage());
    }
    private  void  settingsClick(){
        onBackPressed();
    }
    private  void  languagePage(){
        Intent view = new Intent(this,SettingsLanguage.class);
        startActivity(view);
    }
}