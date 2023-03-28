package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page15activity extends AppCompatActivity {
    TextView txtdash;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page15activity);
        txtdash = findViewById(R.id.txtdash);

        txtdash.setOnClickListener(view -> {
            Intent intent = new Intent(page15activity.this,page16activity.class);
            startActivity(intent);

        });
    }
}