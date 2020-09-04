package com.example.bog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Productos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
    }

    //metodos para los botones
    public void Pelo(View view){
        Intent peloa = new Intent(this, Pelo.class);
        startActivity(peloa);
    }
    //metodos para los botones
    public void Barba(View view){
        Intent barbaa = new Intent(this, Barba.class);
        startActivity(barbaa);
    }
}