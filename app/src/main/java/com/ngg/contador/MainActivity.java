package com.ngg.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int valorContador;
    private TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorContador = 0;

        // recuperamos el texto en el que escribiremos el valor
        contador = findViewById(R.id.contador);


        // 1. buscamos el elemento al que escucha el evento (donde aplicaremos el listener)
        // y llamamos al metodo que incrementa
        findViewById(R.id.incrementar).setOnClickListener(view -> {
            incrementar();
        });


        findViewById(R.id.decrementar).setOnClickListener(view -> {
            decrementar();
        });

        findViewById(R.id.resetear).setOnClickListener(view -> {
            resetear();
        });

        // TODO buscar el elemento que decementa
        // ponerle su OnClickListener
        // y hacer la llamada al metodo que decrementa
        // (similar a lo hecho en 1.)
        // TODO buscar el elemento que resetea
        // ponerle su OnClickListener
        // y hacer la llamada al metodo que resetea
        // (similar a lo hecho en 1.)
    }
    private void incrementar() {
        valorContador ++;
        contador.setText(Integer.toString(valorContador));
    }
    private void decrementar() {
        valorContador--;
        contador.setText(Integer.toString(valorContador));
    }
    private void resetear() {
        valorContador=0;
        contador.setText(Integer.toString(valorContador));
    }
}


