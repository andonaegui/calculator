package com.example.rando.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button plus;
    private Button minus;
    private Button equals;
    private Context appCtx;
    private String operator;
    private String factor;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startComponents();
        startEvents();
    }

    private void startComponents() {
        appCtx = getApplicationContext();
        one =   (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four= (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six= (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight= (Button) findViewById(R.id.eight);
        nine= (Button) findViewById(R.id.nine);
        plus= (Button) findViewById(R.id.plus);
        minus= (Button) findViewById(R.id.minus);
        equals= (Button) findViewById(R.id.equals);
        result= (TextView) findViewById(R.id.result);
    }

    private void refreshScreen(){
        result.setText(factor);


    }

    private void startEvents() {
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "minus";
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "plus";
            }
        });

        /*equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resolve();
            }
        });*/

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "1"; //factor = factor +1
                refreshScreen();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "2"; //factor = factor +1
                refreshScreen();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "3"; //factor = factor +1
                refreshScreen();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "4"; //factor = factor +1
                refreshScreen();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "5"; //factor = factor +1
                refreshScreen();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "6"; //factor = factor +1
                refreshScreen();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "7"; //factor = factor +1
                refreshScreen();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "8"; //factor = factor +1
                refreshScreen();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factor += "9"; //factor = factor +1
                refreshScreen();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}