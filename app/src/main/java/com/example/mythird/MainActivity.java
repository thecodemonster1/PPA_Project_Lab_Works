package com.example.mythird;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn_Enter;
    private EditText editText_Number1;
    private EditText editText_Number2;
    private AlertDialog.Builder builder;
    public static final String Number1_Passed = "number1";
    public static final String Number2_Passed = "number2";


//    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Attach with UI elements
        btn_Enter = (Button) findViewById(R.id.btn_Enter);
        editText_Number1 = (EditText) findViewById(R.id.editText_Number1);
        editText_Number2 = (EditText) findViewById(R.id.editText_Number2);
        builder = new AlertDialog.Builder(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        //Create Button Click Listeners
        
        btn_Enter.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(editText_Number1.getText().toString());
                int number2 = Integer.parseInt(editText_Number2.getText().toString());

//                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
//                intent.putExtra("Number1_Passed", number1);
//                intent.putExtra("Number2_Passed", number2);
//                startActivity(intent);

                builder.setTitle("Alert Dialog")
                        .setMessage("Do you want to send the details to next activity?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                                intent.putExtra("Number1_Passed", number1);
                                intent.putExtra("Number2_Passed", number2);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }



        });


    }








}

