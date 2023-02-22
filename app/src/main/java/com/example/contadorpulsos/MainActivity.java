package com.example.contadorpulsos;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Propiedades de la actividad
    public String num1 = "";
    public String aux = "";
    public String operacion = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void concatNum(View boton){
        Button botonDisp = (Button)boton;
        this.num1 += botonDisp.getText();
        TextView res = (TextView)findViewById(R.id.res);
        res.setText(this.num1);
    }

    public void allocateOperation(View boton){
        Button botonDisp = (Button)boton;
        this.operacion = botonDisp.getText().toString();
        this.aux = this.num1;
        this.num1 = "";
        TextView res = (TextView)findViewById(R.id.res);
        res.setText("");
    }

    public void resolveOperation(View boton){
        TextView res = (TextView)findViewById(R.id.res);
        int resNum = 0;
        switch (this.operacion){
            case "+":
                resNum = parseInt(this.aux) + parseInt(this.num1);
                break;
            case "-":
                resNum = parseInt(this.aux) - parseInt(this.num1);
                break;
            case "*":
                resNum = parseInt(this.aux) * parseInt(this.num1);
                break;
            case "/":
                resNum = parseInt(this.aux) / parseInt(this.num1);
                break;
        }
        res.setText(String.valueOf(resNum));
        this.num1 = res.getText().toString();
    }



}