package com.example.alunos.Aula02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirTela1(View vi){
        Intent it = new Intent(this, Tela1_activity.class);
        startActivity(it);
    }

    public void abrirTela2(View vi){
        EditText input = (EditText) findViewById(R.id.inputNome);
        String nome = input.getText().toString();
        //Intent -> intenção de fazer algo(usar a camera, etc).
        Intent it = new Intent(this, Tela2_activity.class);
        Bundle b = new Bundle();
        b.putString("p_nome", nome);
        it.putExtras(b);
        startActivity(it);
    }
}
