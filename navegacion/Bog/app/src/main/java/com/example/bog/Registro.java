package com.example.bog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    //Metodo para validar el registro
    public void Registrar2(View view){
        Intent registrar2 = new Intent(this, Perfil.class);
        startActivity(registrar2);
    }

}