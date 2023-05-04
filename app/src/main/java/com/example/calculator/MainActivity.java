package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etFirstnumber , etSecondnumber;
    TextView answer;
    Button plus , minus , multiply , divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstnumber = findViewById(R.id.FirstNumber);
        etSecondnumber = findViewById(R.id.SecondNumber);

        answer = findViewById(R.id.Answer);

        plus = findViewById(R.id.Plus);
        minus = findViewById(R.id.Minus);
        multiply = findViewById(R.id.Multiply);
        divide = findViewById(R.id.Divide);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first , second , ans;
                first = Integer.parseInt(etFirstnumber.getText().toString());
                second = Integer.parseInt(etSecondnumber.getText().toString());

                ans = first + second;

                answer.setText(" answer is:= "+ ans);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first , second , ans;
                first = Integer.parseInt(etFirstnumber.getText().toString());
                second = Integer.parseInt(etSecondnumber.getText().toString());

                ans = first - second;

                answer.setText(" answer is:= "+ ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first , second , ans;
                first = Integer.parseInt(etFirstnumber.getText().toString());
                second = Integer.parseInt(etSecondnumber.getText().toString());

                ans = first * second;

                answer.setText(" answer is:= "+ ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int first ;
                float ans;
                float second;
                first = Integer.parseInt(etFirstnumber.getText().toString());
                second = Float.parseFloat(etSecondnumber.getText().toString());

                ans = first / second;



                answer.setText(" answer is:= "+ ans);
            }
        });

    }
}