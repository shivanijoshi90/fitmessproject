package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page10activity extends AppCompatActivity {

    TextView txthist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10activity);
        txthist = findViewById(R.id.txthist);
        txthist.setOnClickListener(view -> {

            Intent intent = new Intent(page10activity.this, page11activity.class);
            startActivity(intent);

        });

    }
}