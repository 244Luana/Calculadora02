package com.example.calculadora02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Stack;

public class Fibonacci extends AppCompatActivity {

    TextView result;
    EditText response;
    Stack<Integer> stack = new Stack<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        response = (EditText) findViewById(R.id.insertfb);
        result = (TextView) findViewById(R.id.respostafb);

    }
    public void calcularFibonacci(View v){
        int responseValue = Integer.parseInt(response.getText().toString());
        int i, aux = 1, aux1 = 0;

        while(!stack.empty()){
            stack.pop();
        }
        stack.push(aux1);
        stack.push(aux);

        for (i = 2; i < responseValue; i++){
            aux = aux + aux1;
            aux1 = aux - aux1;

            stack.push(aux);
        }
        result.setText(stack.toString());
    }

}