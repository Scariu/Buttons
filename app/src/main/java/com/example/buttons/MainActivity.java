package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.buttons.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
        }

    private void initListeners() {
        binding.buttonPlane.setOnClickListener(v -> Toast.makeText(this, "Modo avión desactivado", Toast.LENGTH_LONG).show());
        binding.buttonUpdatingProfile.setOnClickListener(v -> Toast.makeText(this, "Perfil actualizado", Toast.LENGTH_LONG).show());
        binding.buttonPictureSaved.setOnClickListener(v -> Toast.makeText(this, "Imagen guardada en galeria", Toast.LENGTH_LONG).show());
        binding.buttonUnlocked.setOnClickListener(v -> Toast.makeText(this, "Nivel 5 desbloqueado", Toast.LENGTH_LONG).show());
        binding.buttonLevel.setOnClickListener(v -> Toast.makeText(this, "Nivel 4 completado", Toast.LENGTH_LONG).show());
        binding.buttonMusic.setOnClickListener(v -> Toast.makeText(this, "Musica pausada", Toast.LENGTH_LONG).show());
    }
}
