package com.example.alunos.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salvar(View vi){
        TextView txt1 = (TextView) findViewById(R.id.inputNome);
        txt1.setText("Luiz");
        String valor1 = txt1.getText().toString();
        TextView txt2 = (TextView) findViewById(R.id.inputTelefone);
        txt2.setText(valor1);
    }

}
