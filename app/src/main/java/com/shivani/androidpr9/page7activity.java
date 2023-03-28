package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page7activity extends AppCompatActivity {
    TextView txtstart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7activity);

        txtstart = findViewById(R.id.txtstart);

        txtstart.setOnClickListener(view -> {
            Intent intent=new Intent(page7activity.this,page8activity.class);
            startActivity(intent);

        });

    }
}