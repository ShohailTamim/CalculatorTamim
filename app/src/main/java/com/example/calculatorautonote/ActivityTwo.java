package com.example.calculatorautonote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    double no1;
    double no2;
    double total;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        final Button btn0 = (Button)findViewById(R.id.numberZero);
        final Button btn1 = (Button)findViewById(R.id.number1);
        final Button btn2 = (Button)findViewById(R.id.number2);
        final Button btn3 = (Button)findViewById(R.id.number3);
        final Button btn4 = (Button)findViewById(R.id.number4);
        final Button btn5 = (Button)findViewById(R.id.number5);
        final Button btn6 = (Button)findViewById(R.id.number6);
        final Button btn7 = (Button)findViewById(R.id.number7);
        final Button btn8 = (Button)findViewById(R.id.number8);
        final Button btn9 = (Button)findViewById(R.id.number9);
        final Button btnPlus = (Button)findViewById(R.id.numberPlus);
        final Button btnMinus = (Button)findViewById(R.id.numberMinus);
        final Button btnMul = (Button)findViewById(R.id.numberMul);
        final Button btnDiv = (Button)findViewById(R.id.numberDiv);
        final Button btnEquals = (Button)findViewById(R.id.numberEqual);
        final Button btnDot = (Button)findViewById(R.id.numberDot);
        final Button btnClear = (Button)findViewById(R.id.numberClear);
        final Button btnPercent = (Button)findViewById(R.id.buttonPer);
        final Button btnSqr = (Button)findViewById(R.id.buttonSqr);



        final TextView txtView = (TextView)findViewById(R.id.textInput);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn0Text = btn0.getText().toString();
                txtView.setText(txtView.getText()+btn0Text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn1Text = btn1.getText().toString();
                txtView.setText(txtView.getText()+btn1Text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn2Text = btn2.getText().toString();
                txtView.setText(txtView.getText()+btn2Text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn3Text = btn3.getText().toString();
                txtView.setText(txtView.getText()+btn3Text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn4Text = btn4.getText().toString();
                txtView.setText(txtView.getText()+btn4Text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn5Text = btn5.getText().toString();
                txtView.setText(txtView.getText()+btn5Text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn6Text = btn6.getText().toString();
                txtView.setText(txtView.getText()+btn6Text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn7Text = btn7.getText().toString();
                txtView.setText(txtView.getText()+btn7Text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn8Text = btn8.getText().toString();
                txtView.setText(txtView.getText()+btn8Text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn9Text = btn9.getText().toString();
                txtView.setText(txtView.getText()+btn9Text);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText("");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(txtView.getText().toString());
                operator = btnPlus.getText().charAt(0);
                txtView.setText("");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(txtView.getText().toString());
                operator = btnMinus.getText().charAt(0);
                txtView.setText("");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(txtView.getText().toString());
                operator = btnMul.getText().charAt(0);
                txtView.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(txtView.getText().toString());
                operator = btnDiv.getText().charAt(0);
                txtView.setText("");
            }
        });
        btnSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(txtView.getText().toString());
                operator = btnSqr.getText().charAt(0);
                txtView.setText("");
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(txtView.getText().toString());
                operator = btnPercent.getText().charAt(0);
                txtView.setText("");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no2 = Double.parseDouble(txtView.getText().toString());
                switch (operator){
                    case '+':
                        total = no1 + no2;
                        break;
                    case '-':
                        total = no1 - no2;
                        break;
                    case '×':
                        total = no1 * no2;
                        break;
                    case '÷':
                        total = no1 / no2;
                        break;
                    case '^':
                        total = no1*no1;
                        break;
                    case '%':
                        total = ((no1 * no2)/100);
                        break;

                }
                txtView.setText(Double.toString(total));
                no1 = 0;
                no2 = 0;
            }
        });








    }
}
