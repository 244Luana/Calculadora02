package com.example.calculadora02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NumeroPrimo extends AppCompatActivity {

    TextView result;
    EditText response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_primo);

        response = (EditText) findViewById(R.id.insertnp);
        result = (TextView) findViewById(R.id.respostanp);

    }
    public void calcularPrimo(View v){
        int responseValue = Integer.parseInt(response.getText().toString());
        int i, d = 0;

        for(i = 1; i <= responseValue; i++){
            if (responseValue % i == 0){
                d++;
            }
        }
        if (d==2){
            result.setText("É primo!");
        }else{
            result.setText("Não!");
        }
    }
}