package com.example.alunos.Aula02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2_activity);
        //Pega a Intent it como parametro.
        Intent it2 = getIntent();
        //Pega o Bundle 'b' como parametro.
        Bundle b = it2.getExtras();
        //Pega a string da bundle por sua chave
        String a = b.getString("p_nome");
        //Atribui para o textview do Tela 2
        TextView txt1 = (TextView) findViewById(R.id.textTela1);
        txt1.setText(a);
    }
}
