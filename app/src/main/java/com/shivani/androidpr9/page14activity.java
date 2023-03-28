package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page14activity extends AppCompatActivity {
    TextView txtnxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page14activity);

        txtnxt = findViewById(R.id.txtnxt);
        txtnxt.setOnClickListener(view -> {
            Intent intent = new Intent(page14activity.this,page15activity.class);
            startActivity(intent);

        });
    }
}