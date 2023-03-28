package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page4activity extends AppCompatActivity {
    TextView txtlog4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4activity);
        txtlog4 = findViewById(R.id.txtlog4);

        txtlog4.setOnClickListener(view -> {
            Intent intent =new Intent(page4activity.this,page5activity.class);
            startActivity(intent);
        });


    }
}