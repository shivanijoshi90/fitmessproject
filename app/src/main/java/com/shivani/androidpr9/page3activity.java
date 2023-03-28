package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page3activity extends AppCompatActivity {

    TextView txtlog3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3activity);

        txtlog3 =findViewById(R.id.txtlog3);
        txtlog3.setOnClickListener(view -> {
            Intent intent = new Intent(page3activity.this, page4activity.class);
            startActivity(intent);
        });

    }
}