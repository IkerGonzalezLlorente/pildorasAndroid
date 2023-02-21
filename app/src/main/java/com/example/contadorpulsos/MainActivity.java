package com.example.contadorpulsos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Propiedades de la actividad
    public int contadorNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorNum = 0;

    }

    public void aumentarContador(View boton){
        TextView contadorVista = (TextView)findViewById(R.id.contador);
        contadorNum++;
        contadorVista.setText("Contador: " + contadorNum);
    }

    public void resetearContador(View boton){
        TextView contadorVista = (TextView)findViewById(R.id.contador);
        contadorNum = 0;
        contadorVista.setText("Contador: " + contadorNum);
    }

    public void decrementarContador(View boton){
        TextView contadorVista = (TextView)findViewById(R.id.contador);
        contadorNum--;
        contadorVista.setText("Contador: " + contadorNum);
    }

}