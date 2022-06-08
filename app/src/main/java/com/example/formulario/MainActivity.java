package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.formulario.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnOp1.setOnClickListener(view -> {
            pasarPantalla();
        });


    }
    private void pasarPantalla(){
        String palabra1 = binding.etPalabra1.getText().toString();
        String palabra2 = binding.etPalabra2.getText().toString();
        String nombre = binding.etAnimacion.getText().toString();

        Intent intent = new Intent(this,MainActivity2.class);

        intent.putExtra("palabra_uno",palabra1);
        intent.putExtra("palabra_dos",palabra2);
        intent.putExtra("nombre",nombre);


        startActivity(intent);

    }

}