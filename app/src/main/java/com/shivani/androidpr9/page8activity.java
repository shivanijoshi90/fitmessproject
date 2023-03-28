package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page8activity extends AppCompatActivity {
    TextView txtconnect;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8activity);

        txtconnect = findViewById(R.id.txtconnect);
        txtconnect.setOnClickListener(view -> {
            Intent intent = new Intent(page8activity.this,page9activity.class);
            startActivity(intent);
            finish();
        });




    }
}