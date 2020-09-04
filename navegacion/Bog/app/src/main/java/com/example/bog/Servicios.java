package com.example.bog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Servicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);
    }
    public void Citas(View view){
        Intent citas = new Intent(this, Citas.class);
        startActivity(citas);
    }
    public void Productos(View view){
        Intent productos = new Intent(this, Productos.class);
        startActivity(productos);
    }
}