package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page9activity extends AppCompatActivity {
    TextView txtbadge;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9activity);
        txtbadge = findViewById(R.id.txtbadge);
        txtbadge.setOnClickListener(view -> {
            Intent intent = new Intent(page9activity.this,page10activity.class);
            startActivity(intent);

        });
    }
}