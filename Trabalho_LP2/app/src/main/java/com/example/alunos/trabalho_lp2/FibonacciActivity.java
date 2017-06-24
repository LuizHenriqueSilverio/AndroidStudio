package com.example.alunos.trabalho_lp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

import static android.R.attr.x;

public class FibonacciActivity extends AppCompatActivity {

    Stack fib = new Stack<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
    }

    protected void calcular(View n){
        fib.removeAllElements();
        EditText v = (EditText) findViewById(R.id.editNum);
        if(v.getText().toString().compareTo("") != 0) {
            int x = Integer.parseInt(v.getText().toString());
            v.setText("");
            int a = 0;
            fib.push(a);
            if(x!=1) {
                int b = 1;
                fib.push(b);
                int c = 0;
                for (int i = 2; i < x; i++) {
                    c = a + b;
                    fib.push(c);
                    a = b;
                    b = c;
                }
            }
            this.sequencia();
            this.elemento();
            this.soma();
        }
    }

    protected void sequencia(){
        TextView v = (TextView) findViewById(R.id.editSeq);
        v.setText("");
        v.setText(fib.toString());
    }

    protected void soma(){
        int soma = 0;
        for(int i = 0; i < fib.size(); i++)
            soma = soma + Integer.parseInt(fib.pop().toString());
        TextView v = (TextView) findViewById(R.id.editSoma);
        v.setText("");
        v.setText(Integer.toString(soma));
    }

    protected void elemento(){
        TextView v = (TextView) findViewById(R.id.editFib);
        v.setText("");
        String x = fib.pop().toString();
        v.setText(x);
        fib.push(Integer.parseInt(x));
    }
}
