package com.example.bog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Citas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);
    }
    //Metodo para los botones
    public void Validar(View view){
        Intent Validar = new Intent(this,Servicios.class );
        startActivity(Validar);
    }
    public void Cancelar(View view){
        Intent cancelar = new Intent(this, Servicios.class);
        startActivity(cancelar);
    }
}