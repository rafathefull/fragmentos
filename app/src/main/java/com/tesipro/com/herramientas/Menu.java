package com.tesipro.com.herramientas;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Menu extends Fragment {

    private  final int[] BOTONESMENU={R.id.linterna, R.id.musica, R.id.nivel};

    public Menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenu = inflater.inflate(R.layout.fragment_menu, container, false);

        // Curso Android. Fragments IV. Vídeo 69
        // Video: https://www.youtube.com/watch?v=XJ4ruQxw3t8&t=8s
        ImageButton botonmenu;
        for( int i=0; i<BOTONESMENU.length;i++ ){
           botonmenu = (ImageButton) mimenu.findViewById( BOTONESMENU[i] );
           final int queBoton=i;

           botonmenu.setOnClickListener( new View.OnClickListener(){

                public void onClick(View view) {
                    Activity estaActividad = getActivity();
                    ((ComunicaMenu) estaActividad).menu( queBoton );
                }
            });
        }



        return mimenu;
    }

}
