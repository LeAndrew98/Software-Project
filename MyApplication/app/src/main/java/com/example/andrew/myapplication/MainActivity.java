package com.example.andrew.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHome(View view) {
        Intent intent = new Intent(MainActivity.this, Home.class);
        startActivity(intent);

        EditText editText = findViewById(R.id.username);
        String message = editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);

    }

    public void clickSignUp(View view) {
        Intent intent = new Intent(MainActivity.this, SignUp.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menua, menu);


        return super.onCreateOptionsMenu(menu);
    }
}





