package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText e1,e2;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDec;
    double result;
//    Button buttonAdd, buttonSub, buttonDivision, buttonMul, buttonEqual, buttonC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.b0);
        button1 = (Button) findViewById(R.id.b1);
        button2 = (Button) findViewById(R.id.b2);
        button3 = (Button) findViewById(R.id.b3);
        button4 = (Button) findViewById(R.id.b4);
        button5 = (Button) findViewById(R.id.b5);
        button6 = (Button) findViewById(R.id.b6);
        button7 = (Button) findViewById(R.id.b7);
        button8 = (Button) findViewById(R.id.b8);
        button9 = (Button) findViewById(R.id.b9);
//        buttonAdd = (Button) findViewById(R.id.bplus);
//        buttonSub = (Button) findViewById(R.id.bmin);
//        buttonMul = (Button) findViewById(R.id.bmul);
//        buttonDivision = (Button) findViewById(R.id.bdiv);
//        buttonC = (Button) findViewById(R.id.bclear);
//        buttonEqual = (Button) findViewById(R.id.beq);
        buttonDec = (Button) findViewById(R.id.bdec);
        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        tv1 = findViewById(R.id.txtRes);
        Toast.makeText(this, "Enter The Two Numbers And The Opeartion And Then Hit Equals!", Toast.LENGTH_SHORT).show();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "1");
                else
                    e2.setText(e2.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "2");
                else
                    e2.setText(e2.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "3");
                else
                    e2.setText(e2.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "4");
                else
                    e2.setText(e2.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "5");
                else
                    e2.setText(e2.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "6");
                else
                    e2.setText(e2.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "7");
                else
                    e2.setText(e2.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "8");
                else
                    e2.setText(e2.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "9");
                else
                    e2.setText(e2.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + "0");
                else
                    e2.setText(e2.getText() + "0");
            }
        });
        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.hasFocus())
                    e1.setText(e1.getText() + ".");
                else
                    e2.setText(e2.getText() + ".");
            }
        });


    }
    public double add(View V){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        result = a1+a2;
        return result;
    }
    public double sub(View V){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        result = a1-a2;
        return result;
    }
    public double mul(View V){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        result = a1*a2;
        return result;
    }
    public double div(View V){
        float a1 = Integer.parseInt(e1.getText().toString());
        float a2 = Integer.parseInt(e2.getText().toString());
        result = a1/a2;
        return result;
    }
    public void res(View V){
        tv1.setText(""+result);
    }
    public void clear(View V){
        e1.setText("");
        e2.setText("");
        tv1.setText("0");
    }
}