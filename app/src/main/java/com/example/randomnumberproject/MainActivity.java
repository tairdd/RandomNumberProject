package com.example.randomnumberproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    TextView tvNumber;
    Button btnGenerate, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumber = findViewById(R.id.tvNumber);
        btnGenerate = findViewById(R.id.btnGenerate);
        btnCancel = findViewById(R.id.btnCancel);

        btnGenerate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(1000);
                tvNumber.setText("Number = " + num);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvNumber.setText("Number not found");
            }
        });
    }
}