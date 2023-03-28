package com.shivani.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page2activity extends AppCompatActivity {
    TextView txtlog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2activity);

        txtlog2 = findViewById(R.id.txtlog2);
        txtlog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page2activity.this,page3activity.class);
                startActivity(intent);

            }
        });

    }
}