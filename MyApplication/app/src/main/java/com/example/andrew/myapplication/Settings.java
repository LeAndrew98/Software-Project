package com.example.andrew.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Settings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void clickHome(View view) {
        Intent intent = new Intent(Settings.this, Home.class);
        startActivity(intent);
    }

    public void clickAboutUs(View view) {
        Intent intent = new Intent(Settings.this, AboutUs.class);
        startActivity(intent);
    }

}
