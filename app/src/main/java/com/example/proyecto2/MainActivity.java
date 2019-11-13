package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//este codigo se ejecuta antes de todos

    }
    @Override
    protected void onResume() {
        super.onResume();
     //en este punto la aplicacion ya cargó
        //this en un activity:tiene el poder de controlar toda la pantalla
        //this es de tipo contecto aqui
        Toast.makeText(this,
                "como se mueve esa muchachota",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,
                "ya sientese señora",
                Toast.LENGTH_LONG).show();
    }
}
