package com.example.spark.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView resultv,inputv;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndot,btnplusmin,btnequal,btnbraket,btnplus,btnmin,btncroos,btnclear,btnmul,btndevided;
    private double firstnum;
    private double secondnum;
    private double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btncroos=(Button) findViewById(R.id.btncroos);
        btndevided=(Button) findViewById(R.id.btndevided);
        btnmul=(Button) findViewById(R.id.btnmul);
        btnclear=(Button) findViewById(R.id.btnclear);
        btnmin=(Button) findViewById(R.id.btnmin);
        btnplus=(Button) findViewById(R.id.btnplus);
        btnbraket=(Button) findViewById(R.id.btnbraket);
        btnequal=(Button) findViewById(R.id.btnequal);
        btnplusmin=(Button) findViewById(R.id.btnplusmin);
        btndot=(Button) findViewById(R.id.btndot);

        resultv=(TextView) findViewById(R.id.resultv);
        inputv=(TextView) findViewById(R.id.inputv);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "0";
                inputv.setText(takeln);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "1";
                inputv.setText(takeln);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "2";
                inputv.setText(takeln);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "3";
                inputv.setText(takeln);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "4";
                inputv.setText(takeln);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "5";
                inputv.setText(takeln);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "6";
                inputv.setText(takeln);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "7";
                inputv.setText(takeln);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "8";
                inputv.setText(takeln);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String takeln;
                takeln=inputv.getText()+ "9";
                inputv.setText(takeln);
            }
        });
    }
}
