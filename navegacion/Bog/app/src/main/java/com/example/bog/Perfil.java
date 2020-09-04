package com.example.bog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    //metodos para los botones
    public void CerrarSesion(View view){
        Intent cerrar = new Intent(this, MainActivity.class);
        startActivity(cerrar);
    }
    public void Servicios(View view) {
        Intent servicios = new Intent(this, Servicios.class);
        startActivity(servicios);
    }
}