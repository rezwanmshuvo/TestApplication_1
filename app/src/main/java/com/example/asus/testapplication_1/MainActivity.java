package com.example.asus.testapplication_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText Et1,Et2,Res;
    Button btnSum,Div,btnmlp,btnSub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Et1=(EditText)findViewById(R.id.Et1);
        Et2=(EditText)findViewById(R.id.Et2);
        Res=(EditText)findViewById(R.id.Res);

        Div=(Button)findViewById(R.id.Div);

        btnSub=(Button)findViewById(R.id.btnSub);

        btnmlp=(Button)findViewById(R.id.btnmlp);

        btnSum=(Button)findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1,num2,sum;
                num1=Float.parseFloat(Et1.getText().toString());
                num2=Float.parseFloat(Et2.getText().toString());

                sum=num1+num2;
                Res.setText(Float.toString(sum));


            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1,num2,div;
                num1=Float.parseFloat(Et1.getText().toString());
                num2=Float.parseFloat(Et2.getText().toString());

                div=num1/num2;
                Res.setText(Float.toString(div));

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1,num2,Sub;
                num1=Float.parseFloat(Et1.getText().toString());
                num2=Float.parseFloat(Et2.getText().toString());
                Sub=num1-num2;
                Res.setText(Float.toString(Sub));
            }
        });

        btnmlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1,num2,mlp;
                num1=Float.parseFloat(Et1.getText().toString());
                num2=Float.parseFloat(Et2.getText().toString());

                mlp=num1*num2;
                Res.setText(Float.toString(mlp));
            }
        });




    }

}
