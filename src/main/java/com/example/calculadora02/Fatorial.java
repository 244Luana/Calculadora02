package com.example.calculadora02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fatorial extends AppCompatActivity {

    TextView result;
    EditText response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);

        response = (EditText) findViewById(R.id.insertft);
        result = (TextView) findViewById(R.id.respostaft);

    }
    public void fatorar(View v){
        int responseValue = Integer.parseInt(response.getText().toString());
        int i, fator = responseValue;

        for (i = responseValue - 1; i >= 1; i--){
            fator *= i;
        }
        result.setText(Integer.toString(fator));
    }
}