package com.example.shailesh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    double num1, num2, sum;
    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText) findViewById(R.id.editText);
        secondNumber = (EditText) findViewById(R.id.editText2);
        addResult = (TextView) findViewById(R.id.textView);
        btnAdd = (Button) findViewById(R.id.button3);
        btnAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sum = num1 + num2;
                addResult.setText(Double.toString(sum));
            }
        });
    }


    }
