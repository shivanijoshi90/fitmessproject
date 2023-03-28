package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page6activity extends AppCompatActivity {
    TextView txtdone;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6activity);
        txtdone=findViewById(R.id.txtdone);

        txtdone.setOnClickListener(view -> {
            Intent intent = new Intent(page6activity.this,page7activity.class);
            startActivity(intent);

        });

    }
}