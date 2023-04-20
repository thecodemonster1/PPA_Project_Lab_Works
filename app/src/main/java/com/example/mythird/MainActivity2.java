package com.example.mythird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView num1txt;
    private TextView num2txt;
    private TextView answer;
//    private static int new_num1;
//    private static int new_num2;
    private static int finalAns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Button variables
        num1txt = findViewById(R.id.num1);
        num2txt = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

//        All other variables want to become inside the onResume funciton Not inside the onCreate function

    }

    @Override
    protected void onResume(){
        super.onResume();

        // Other Variables
        Intent intent = getIntent();
        int new_num1 = intent.getIntExtra(MainActivity.number1, 0);
        int new_num2 = intent.getIntExtra(MainActivity.number2, 0);

        // Displaying Numbers... (num1 and num2)
        num1txt.setText(Integer.toString(new_num1));
        num2txt.setText(Integer.toString(new_num2));

        // ID of answer TextView field
        answer = findViewById(R.id.Answer);

        // OnClick Method of Addition Button
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity2.this, "+ Button is clicked!", Toast.LENGTH_SHORT).show();
                finalAns = new_num1+ new_num2;
                answer.setText(""+ finalAns);
            }
        });

        // OnClick Method of Subtraction Button
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity2.this, "- Button is clicked!", Toast.LENGTH_SHORT).show();
                finalAns = new_num1 - new_num2;
                answer.setText(""+ finalAns);
            }
        });

        // OnClick Method of Multipliction Button
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity2.this, "* Button is clicked!", Toast.LENGTH_SHORT).show();
                finalAns = new_num1 * new_num2;
                answer.setText(""+ finalAns);
            }
        });

        // OnClick Method of Divition Button
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity2.this, "/ Button is clicked!", Toast.LENGTH_SHORT).show();
                finalAns = new_num1 / new_num2;
                answer.setText(""+ finalAns);
            }
        });

    }
}