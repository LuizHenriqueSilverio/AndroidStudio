package com.example.alunos.trabalho_lp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FatorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);
    }

    protected void calcular(View n){
        EditText v  = (EditText) findViewById(R.id.editNum);
        if(v.getText().toString().compareTo("") != 0) {
            int x = Integer.parseInt(v.getText().toString());
            TextView v2 = (TextView) findViewById(R.id.editVal);
            v2.setText(Integer.toString(x));
            v.setText("");
            int soma = 1;
            for(int i = 1; i <= x; i++){
                soma = soma*i;
            }
            TextView v1 = (TextView) findViewById(R.id.editFat);
            v1.setText("");
            v1.setText(Integer.toString(soma));
        }
    }
}
