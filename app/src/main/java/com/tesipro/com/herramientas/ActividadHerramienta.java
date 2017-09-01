package com.tesipro.com.herramientas;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActividadHerramienta extends AppCompatActivity implements ComunicaMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_herramienta);

        Bundle extras = getIntent().getExtras();
        menu( extras.getInt("BOTONPULSADO") );


    }

    // Curso Android. Fragments VI. Vídeo 71
    // https://www.youtube.com/watch?v=dM_StC3ut28&t=165
    @Override
    public void menu(int queboton) {
        FragmentManager miManejador = getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        miTransaccion.replace( R.id.herramientas,)
    }
}
