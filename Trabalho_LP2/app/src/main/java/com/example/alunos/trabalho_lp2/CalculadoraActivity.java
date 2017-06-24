package com.example.alunos.trabalho_lp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class CalculadoraActivity extends AppCompatActivity {

    Stack pilha = new Stack<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        this.exibir();
    }

    protected void empilhar(View v){
        TextView view1 = (TextView) findViewById(R.id.editNum);
        if(view1.getText().toString().compareTo(".") != 0) {
            if (view1.getText().toString().compareTo("") != 0) {
                double numero = Double.parseDouble(view1.getText().toString());
                pilha.push(numero);
            }
            this.exibir();
        }
        view1.setText("");
    }

    protected void desempilhar(View v){
        if(pilha.size() > 0)
            pilha.pop();
        this.exibir();
    }

    protected void limpar(View v){
        if(pilha.size() > 0)
            pilha.removeAllElements();
        this.exibir();
    }

    protected void somar(View v){
        if(pilha.size() > 1) {
            double x = (double) pilha.pop();
            double y = (double) pilha.pop();
            double z = x + y;
            pilha.push(z);
            this.exibir();
        }
    }

    protected void subtrair(View v){
        if(pilha.size() > 1) {
            double x = (double) pilha.pop();
            double y = (double) pilha.pop();
            double z = x - y;
            pilha.push(z);
            this.exibir();
        }
    }

    protected void multiplicar(View v){
        if(pilha.size() > 1) {
            double x = (double) pilha.pop();
            double y = (double) pilha.pop();
            double z = x * y;
            pilha.push(z);
            this.exibir();
        }
    }

    protected void dividir(View v) {
        if(pilha.size() > 1) {
            double x = (double) pilha.pop();
            double y = (double) pilha.pop();
            if(y == 0) {
                pilha.push(y);
                pilha.push(x);
            }
            else {
                double z = x / y;
                pilha.push(z);
                this.exibir();
            }
        }
    }

    protected void exibir(){
        TextView view2 = (TextView) findViewById(R.id.outputStack);
        view2.setText(pilha.toString());
    }

}
