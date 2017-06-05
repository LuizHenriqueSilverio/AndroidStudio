package com.example.alunos.stack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Stack pilha = new Stack();
    int tam = 0;

    public void empilhar(View v) {
        TextView txt1 = (TextView) findViewById(R.id.inputNumber);
        TextView txt2 = (TextView) findViewById(R.id.outputStack);
        int number = Integer.parseInt(txt1.getText().toString());
        pilha.push(number);
        txt2.setText(pilha.toString());
        tam++;
    }

    public void soma(View v) {
        if (tam > 1) {
            int var1 = (int) pilha.pop();
            int var2 = (int) pilha.pop();
            int var3 = var1 + var2;
            pilha.push(var3);
            TextView txt2 = (TextView) findViewById(R.id.outputStack);
            txt2.setText(pilha.toString());
            tam--;
        }
    }

    public void subtracao(View v) {
        if (tam > 1) {
            int var1 = (int) pilha.pop();
            int var2 = (int) pilha.pop();
            int var3 = var1 - var2;
            pilha.push(var3);
            TextView txt2 = (TextView) findViewById(R.id.outputStack);
            txt2.setText(pilha.toString());
            tam--;
        }
    }

    public void multiplicacao(View v) {
        if (tam > 1) {
            int var1 = (int) pilha.pop();
            int var2 = (int) pilha.pop();
            int var3 = var1 * var2;
            pilha.push(var3);
            TextView txt2 = (TextView) findViewById(R.id.outputStack);
            txt2.setText(pilha.toString());
            tam--;
        }
    }

    public void divisao(View v) {
        if (tam > 1) {
            int var1 = (int) pilha.pop();
            int var2 = (int) pilha.pop();
            int var3 = var1 / var2;
            pilha.push(var3);
            TextView txt2 = (TextView) findViewById(R.id.outputStack);
            txt2.setText(pilha.toString());
            tam--;
        }
    }

    public void desempilhar(View v) {
        if (tam > 0) {
            pilha.pop();
            TextView txt2 = (TextView) findViewById(R.id.outputStack);
            txt2.setText(pilha.toString());
            tam--;
        }
    }
}
