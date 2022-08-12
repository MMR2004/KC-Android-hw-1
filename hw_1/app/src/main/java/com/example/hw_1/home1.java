package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        // Here to Grade Calculater
        Button grade = findViewById(R.id.GradeCalculater);

        grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gradeTruck = new Intent(home1.this,grade_culculater.class);
                startActivity(gradeTruck);
            }
        });

        // Here to Simple Calculater
        Button calculater = findViewById(R.id.Calculater);

        calculater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculaterTruck = new Intent(home1.this, MainActivity3.class);
                startActivity(calculaterTruck);
            }
        });


    }
}