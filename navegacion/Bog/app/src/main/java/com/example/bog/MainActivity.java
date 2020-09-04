package com.example.bog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo del boton registrar

    public void Registrar(View view){
        Intent registrar = new Intent(this, Registro.class);
        startActivity(registrar);
    }

    public void Validar(View view){
        Intent validar = new Intent(this, Perfil.class);
        startActivity(validar);
    }
}