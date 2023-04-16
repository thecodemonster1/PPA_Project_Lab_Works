package com.example.mythird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button result;
    private TextView num1txt;
    private TextView num2txt;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num1txt = findViewById(R.id.num1);
        num2txt  = findViewById(R.id.num2);

        Intent intent = getIntent();


        int new_num1 = intent.getIntExtra(MainActivity.number1, 0);
        int new_num2 = intent.getIntExtra(MainActivity.number2, 0);


        num1txt.setText(Integer.toString(new_num1));
        num2txt.setText(Integer.toString(new_num2));

    }
}