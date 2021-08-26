package com.example.calculadora02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Button buttonFatorial, buttonFibonacci, buttonNumeroPrimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFatorial = findViewById(R.id.fatorialbtn);
        buttonFibonacci = findViewById(R.id.fibonaccibtn);
        buttonNumeroPrimo = findViewById(R.id.numeroPrimobtn);

        buttonFatorial.setOnClickListener(new View.OnClickListener(){
            /*@Override*/
            public void onClick(View v){
                Intent fatorial = new Intent(getApplicationContext(), Fatorial.class);
                startActivity(fatorial);
            }
        });

        buttonFibonacci.setOnClickListener(new View.OnClickListener(){
            /*@Override*/
            public void onClick(View v){
                Intent fibonacci = new Intent(getApplicationContext(), Fibonacci.class);
                startActivity(fibonacci);
            }
        });

        buttonNumeroPrimo.setOnClickListener(new View.OnClickListener(){
            /*@Override*/
            public void onClick(View v){
                Intent numeroPrimo = new Intent(getApplicationContext(), NumeroPrimo.class);
                startActivity(numeroPrimo);
            }
        });

    }
}