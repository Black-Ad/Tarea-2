package com.example.administrador.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.edtNumero1);
        n2 = (EditText) findViewById(R.id.edtNumero2);

        Button suma = (Button) findViewById(R.id.btnsum);
        Button resta = (Button) findViewById(R.id.btnres);
        Button mul = (Button) findViewById(R.id.btnmul);
        Button divi = (Button) findViewById(R.id.btndiv);
        final TextView res = (TextView) findViewById(R.id.textResultado);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float (n1.getText().toString());
                float num2 = new Float (n2.getText().toString());
                res.setText("Resultado: "+(num1+num2));
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float (n1.getText().toString());
                float num2 = new Float (n2.getText().toString());
                res.setText("Resultado: "+(num1-num2));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float (n1.getText().toString());
                float num2 = new Float (n2.getText().toString());
                res.setText("Resultado: "+(num1*num2));
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                float num1 = new Float (n1.getText().toString());
                float num2 = new Float (n2.getText().toString());
                res.setText("Resultado: "+(num1/num2));
            }
        });
    }
}