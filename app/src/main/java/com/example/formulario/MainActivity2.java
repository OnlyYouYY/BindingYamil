package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.formulario.databinding.ActivityMain2Binding;
import com.example.formulario.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;
    private Animation parpadeo;
    private String palabra1,palabra2,nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        iniciar();
        obtenerDatos();
        Calculo1();

    }
    private void iniciar(){
        binding.txtNombre.setVisibility(View.GONE);
        binding.btnIniciar.setOnClickListener(view->{
            binding.txtNombre.setText(nombre+" inicializo la animacion");
            binding.txtNombre.setVisibility(View.VISIBLE);
            inicializarAnimaciones();
            activarAnimacionParpadeo();
        });
    }
    private void Calculo1(){
        int c1=0;
        for(int x=0;x<palabra1.length();x++) {
            if ((palabra1.charAt(x)=='a') || (palabra1.charAt(x)=='e') || (palabra1.charAt(x)=='i') || (palabra1.charAt(x)=='o') || (palabra1.charAt(x)=='u')){
                c1++;
            }
        }
        int c2=0;

        for(int x=0;x<palabra2.length();x++) {
            if ((palabra2.charAt(x)=='a') || (palabra2.charAt(x)=='e') || (palabra2.charAt(x)=='i') || (palabra2.charAt(x)=='o') || (palabra2.charAt(x)=='u')){
                c2++;
            }
        }
        int res1 = c1;
        int res2 = c2;
        int resF = c1+c2;


        binding.txtResultado.setText("El nombre tiene "+res1+" vocales \nLa materia tiene "+res2+" vocales \nTotal son "+resF+" vocales");

    }
    private void inicializarAnimaciones() {
        parpadeo = AnimationUtils.loadAnimation(this,R.anim.parpadeo);
    }
    private void activarAnimacionParpadeo() {
        parpadeo.setDuration(1200);
        parpadeo.setRepeatCount(Animation.INFINITE);
        parpadeo.setRepeatMode(Animation.REVERSE);
        binding.ivImagen.startAnimation(parpadeo);
    }

    private void obtenerDatos() {
        palabra1= this.getIntent().getExtras().getString("palabra_uno");
        palabra2= this.getIntent().getExtras().getString("palabra_dos");
        nombre= this.getIntent().getExtras().getString("nombre");
    }
}