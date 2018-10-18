package com.example.andrew.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;

public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void clickHome(View view) {
        Intent intent = new Intent(SignUp.this, Home.class);
        startActivity(intent);

        EditText editText = findViewById(R.id.editText5);
        String message = editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);
    }

    public void clickLogin(View view) {
        Intent intent = new Intent(SignUp.this, MainActivity.class);
        startActivity(intent);
    }
}
