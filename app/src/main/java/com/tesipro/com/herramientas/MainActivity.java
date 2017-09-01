package com.tesipro.com.herramientas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ComunicaMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Curso Android. Fragments V. Vídeo 70
    // https://www.youtube.com/watch?v=UIxAGr9nPII
    @Override
    public void menu(int queboton) {
        Intent in= new Intent(this, ActividadHerramienta.class);
        in.putExtra("BOTONPULSADO",queboton);
        startActivity(in);
    }
}
