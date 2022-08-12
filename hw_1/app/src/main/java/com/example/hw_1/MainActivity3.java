package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        final EditText num1 = findViewById(R.id.number1);
        final EditText num2 = findViewById(R.id.number2);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button multi = findViewById(R.id.multi);
        Button divide = findViewById(R.id.divide);
        TextView result = findViewById(R.id.result);
        Button reset = findViewById(R.id.reset);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(num1.getText().toString()) ;
                double b = Integer.parseInt(num2.getText().toString()) ;
                double x = a+b ;
                Toast.makeText(MainActivity3.this,"result is"+x,Toast.LENGTH_LONG).show();
                result.setText("the add is: " + Double.toString(x));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(num1.getText().toString()) ;
                double b = Integer.parseInt(num2.getText().toString()) ;
                double x = a-b ;
                Toast.makeText(MainActivity3.this,"result is"+x,Toast.LENGTH_LONG).show();
                result.setText("the sub is: " + Double.toString(x));
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(num1.getText().toString()) ;
                double b = Integer.parseInt(num2.getText().toString()) ;
                double x = a*b ;
                Toast.makeText(MainActivity3.this,"result is"+x,Toast.LENGTH_LONG).show();
                result.setText("the multi is: " + Double.toString(x));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Integer.parseInt(num1.getText().toString()) ;
                double b = Integer.parseInt(num2.getText().toString()) ;
                double x = a/b ;
                Toast.makeText(MainActivity3.this,"result is"+x,Toast.LENGTH_LONG).show();
                result.setText("the divide is: " + Double.toString(x));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText("");
                num2.setText("");
                result.setText("Result");

            }
        });

        Button homehome2 = findViewById(R.id.Homehome2);

        homehome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home2Truck = new Intent(MainActivity3.this, home1.class);
                startActivity(Home2Truck);
            }
        });

    }
}