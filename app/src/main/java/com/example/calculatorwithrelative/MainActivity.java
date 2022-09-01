package com.example.calculatorwithrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button tryButton;
    Button tambah;
    Button kurang;
    Button kali;
    Button bagi;

    TextView textResultTextView;
    TextView inputUser1;
    TextView inputUser2;
    TextView output;
    int counter = 0;
    boolean clicked = true;
    int calculateSession = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUser1 = findViewById(R.id.inputUser1);
        inputUser2 = findViewById(R.id.inputUser2);
        output = findViewById(R.id.result);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intInput1 = Integer.parseInt(inputUser1.getText().toString());
                int intInput2 = Integer.parseInt(inputUser2.getText().toString());
                calculateSession = intInput1 + intInput2;
                output.setText(Integer.toString(calculateSession));
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intInput1 = Integer.parseInt(inputUser1.getText().toString());
                int intInput2 = Integer.parseInt(inputUser2.getText().toString());
                calculateSession = intInput1 - intInput2;
                output.setText(Integer.toString(calculateSession));
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intInput1 = Integer.parseInt(inputUser1.getText().toString());
                int intInput2 = Integer.parseInt(inputUser2.getText().toString());
                calculateSession = intInput1 * intInput2;
                output.setText(Integer.toString(calculateSession));
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intInput1 = Integer.parseInt(inputUser1.getText().toString());
                int intInput2 = Integer.parseInt(inputUser2.getText().toString());
                calculateSession = intInput1 / intInput2;
                output.setText(Integer.toString(calculateSession));
            }
        });
    }
}