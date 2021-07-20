package com.example.govipola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SettingsLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_language);
        ImageView view  = (ImageView) findViewById(R.id.menuLanguage);
        view.setOnClickListener(v->back());
    }
    private  void  back(){
        onBackPressed();
    }
}