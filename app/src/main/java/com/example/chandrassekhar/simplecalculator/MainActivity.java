package com.example.chandrassekhar.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button butadd,butsub,butdiv,butmul,butclr;
    private EditText edittxt1,edittxt2;
    private TextView tvresult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        butadd = (Button)findViewById(R.id.button1);
        butsub = (Button)findViewById(R.id.button2);
        butmul = (Button)findViewById(R.id.button3);
        butdiv = (Button)findViewById(R.id.button4);
        butclr = (Button)findViewById(R.id.button5);
        edittxt1 = (EditText)findViewById(R.id.edit1);
        edittxt2 = (EditText)findViewById(R.id.edit2);
        tvresult = (TextView)findViewById(R.id.text3); 
        butadd.setOnClickListener(this);
        butsub.setOnClickListener(this);
        butdiv.setOnClickListener(this);
        butmul.setOnClickListener(this);
        butclr.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

            String clr=" ";
            String num1 = edittxt1.getText().toString();
            String num2 = edittxt2.getText().toString();

            switch (view.getId())
            {
                case R.id.button1:
                    int add = Integer.parseInt(num1) + Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(num1)+" + "+String.valueOf(num2)+" ="+String.valueOf(add));
                    break;
                case R.id.button2:
                    int sub = Integer.parseInt(num1) - Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(num1)+" - "+ String.valueOf(num2)+" = "+String.valueOf(sub));
                    break;
                case R.id.button3:
                    int mul = Integer.parseInt(num1) * Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(num1)+" * "+ String.valueOf(num2)+" = "+String.valueOf(mul));
                    break;
                case R.id.button4:
                    int div = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(num1)+" / "+ String.valueOf(num2)+" = "+String.valueOf(div));
                    break;
                case R.id.button5:
                    edittxt1.setText(String.valueOf(clr));
                    edittxt2.setText(String.valueOf(clr));
            }

        }

    }

