package com.ekko.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String number = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "@";

    private TextView answerTV;
    private Button keyPad0,keyPad1,keyPad2,keyPad3,keyPad4,keyPad5,keyPad6,keyPad7,keyPad8,keyPad9;
    private Button keyPadPlus,keyPadMins,keyPadDiv,keyPadMult,keyPadEqual,keyPadClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerTV = findViewById(R.id.answer_tv);

        keyPad0 = findViewById(R.id.key_0_btn);
        keyPad1 = findViewById(R.id.key_1_btn);
        keyPad2 = findViewById(R.id.key_2_btn);
        keyPad3 = findViewById(R.id.key_3_btn);
        keyPad4 = findViewById(R.id.key_4_btn);
        keyPad5 = findViewById(R.id.key_5_btn);
        keyPad6 = findViewById(R.id.key_6_btn);
        keyPad7 = findViewById(R.id.key_7_btn);
        keyPad8 = findViewById(R.id.key_8_btn);
        keyPad9 = findViewById(R.id.key_9_btn);

        keyPadPlus = findViewById(R.id.key_plus_btn);
        keyPadMins = findViewById(R.id.key_mins_btn);
        keyPadMult = findViewById(R.id.key_mult_btn);
        keyPadDiv = findViewById(R.id.key_div_btn);
        keyPadEqual = findViewById(R.id.key_equal_btn);
        keyPadClear = findViewById(R.id.key_clear_btn);

        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);

        keyPadPlus.setOnClickListener(this);
        keyPadMins.setOnClickListener(this);
        keyPadMult.setOnClickListener(this);
        keyPadDiv.setOnClickListener(this);
        keyPadEqual.setOnClickListener(this);
        keyPadClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.key_0_btn:
                number = number + 0;
                answerTV.setText(number);
                break;
            case R.id.key_1_btn:
                number = number + 1;
                answerTV.setText(number);
                break;
            case R.id.key_2_btn:
                number = number + 2;
                answerTV.setText(number);
                break;
            case R.id.key_3_btn:
                number = number + 3;
                answerTV.setText(number);
                break;
            case R.id.key_4_btn:
                number = number + 4;
                answerTV.setText(number);
                break;
            case R.id.key_5_btn:
                number = number + 5;
                answerTV.setText(number);
                break;
            case R.id.key_6_btn:
                number = number + 6;
                answerTV.setText(number);
                break;
            case R.id.key_7_btn:
                number = number + 7;
                answerTV.setText(number);
                break;
            case R.id.key_8_btn:
                number = number + 8;
                answerTV.setText(number);
                break;
            case R.id.key_9_btn:
                number = number + 9;
                answerTV.setText(number);
                break;
            case R.id.key_plus_btn:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.key_mins_btn:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.key_mult_btn:
                symbol = "*";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.key_div_btn:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.key_clear_btn:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                answerTV.setText("");
                break;
            case R.id.key_equal_btn:
                num2 = Integer.parseInt(number);
                switch (symbol){
                    case "+":
                        answerTV.setText("answer: " + (num1 + num2));
                        break;
                    case "-":
                        answerTV.setText("answer: " + (num1 - num2));
                        break;
                    case "*":
                        answerTV.setText("answer: " + (num1 * num2));
                        break;
                    case "/":
                        answerTV.setText("answer: " + (num1 / num2));
                        break;
                    default:
                        answerTV.setText(number);
                        break;

                }

                break;
            default:
                break;

        }

    }
}
