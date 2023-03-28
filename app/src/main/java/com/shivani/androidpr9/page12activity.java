package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page12activity extends AppCompatActivity {
    TextView txtexr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12activity);
        txtexr = findViewById(R.id.txtexr);

        txtexr.setOnClickListener(view -> {

            Intent intent = new Intent(page12activity.this,page13activity.class);
            startActivity(intent);

        });
    }
}