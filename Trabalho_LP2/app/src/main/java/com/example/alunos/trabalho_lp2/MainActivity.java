package com.example.alunos.trabalho_lp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void calculadora(View v){
        Intent it = new Intent(this, CalculadoraActivity.class);
        startActivity(it);
    }

    protected void fibonacci(View v){
        Intent it = new Intent(this, FibonacciActivity.class);
        startActivity(it);
    }

    protected void fatorial(View v){
        Intent it = new Intent(this, FatorialActivity.class);
        startActivity(it);
    }
}
