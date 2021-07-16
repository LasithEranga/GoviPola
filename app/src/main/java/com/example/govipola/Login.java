package com.example.govipola;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView text = (TextView) findViewById(R.id.textView);
        ImageView img = (ImageView) findViewById(R.id.imageView5);
        img.setOnClickListener(v -> openActivity());

    }
    public void openActivity(){
        Intent intent = new Intent (this, Settings.class);
        startActivity(intent);
    }
}