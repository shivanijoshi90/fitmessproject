package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page5activity extends AppCompatActivity {
    TextView txtnext;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5activity);
        txtnext=findViewById(R.id.txtnext);

        txtnext.setOnClickListener(view -> {

            Intent intent = new Intent(page5activity.this,page6activity.class);
            startActivity(intent);

        });
    }
}