package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class grade_culculater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_culculater);

        final double[] quizes = {0};
        final double[] homeWork = {0};
        final double[] midTerms = {0};
        final double[] finall = {0};
        EditText Quizes ;
        EditText HomeWork;
        EditText MidTerms;
        EditText Final;
        Button Calculate,Reset;
        TextView Result;

        Quizes = findViewById(R.id.editTextTextQuizes);
        HomeWork = findViewById(R.id.editTextTextHomeWork);
        MidTerms = findViewById(R.id.editTextTextMidTerms);
        Final = findViewById(R.id.editTextTextFinal);
        Calculate = findViewById(R.id.calculate);
        Result = findViewById(R.id.result);
        Reset = findViewById(R.id.reset);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quizes[0] = Double.parseDouble(Quizes.getText().toString());
                homeWork[0] = Double.parseDouble(HomeWork.getText().toString());
                midTerms[0] = Double.parseDouble(MidTerms.getText().toString());
                finall[0] = Double.parseDouble(Final.getText().toString());

                if (quizes[0] > 15 || Quizes.equals(null) || Quizes.equals("")){
                    Toast.makeText(getApplicationContext(),"The number you set is higher than required or empty(Quizes) ",Toast.LENGTH_LONG).show();
                }
                if (homeWork[0] > 25 || HomeWork.equals(null) || HomeWork.equals("")){
                    Toast.makeText(getApplicationContext(),"The number you set is higher than required or empty(HomeWork) ",Toast.LENGTH_LONG).show();
                }
                if (midTerms[0] > 30 || MidTerms.equals(null) || MidTerms.equals("")){
                    Toast.makeText(getApplicationContext(),"The number you set is higher than required or empty(Mid terms) ", Toast.LENGTH_LONG).show();
                }
                if (finall[0] > 30 || Final.equals(null) || Final.equals("")){
                    Toast.makeText(getApplicationContext(),"The number you set is higher than required or empty(Final) ",Toast.LENGTH_LONG).show();
            }else{
                    double a = Double.parseDouble(Quizes.getText().toString());
                    double b = Double.parseDouble(HomeWork.getText().toString());
                    double c = Double.parseDouble(MidTerms.getText().toString());
                    double d = Double.parseDouble(Final.getText().toString());
                    double x = (a+b+c+d) ;
                    Result.setText("Total is: "+Double.toString(x)+"%");
                }
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quizes.setText("");
                HomeWork.setText("");
                MidTerms.setText("");
                Final.setText("");
                Result.setText("Result");
            }
        });

        Button home = findViewById(R.id.Homehome);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeTruck = new Intent(grade_culculater.this, home1.class);
                startActivity(homeTruck);
            }
        });

    }
}