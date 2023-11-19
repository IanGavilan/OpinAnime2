package com.santotomas.opinanime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AttackOnTitan extends AppCompatActivity {

    Button btnvolveraot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attack_on_titan);
        btnvolveraot = findViewById(R.id.btn_volveraot);

        btnvolveraot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aot = new Intent(AttackOnTitan.this, Inicio.class);
                startActivity(aot);
            }
        });
    }
}