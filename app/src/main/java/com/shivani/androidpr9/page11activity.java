package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page11activity extends AppCompatActivity {
    TextView txtstats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11activity);
        txtstats =findViewById(R.id.txtstats);

        txtstats.setOnClickListener(view -> {

            Intent intent = new Intent(page11activity.this,page12activity.class);
            startActivity(intent);

        });
    }
}