package com.santotomas.opinanime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnePiece extends AppCompatActivity {

    Button btnvolvero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_piece);
        btnvolvero = findViewById(R.id.btn_volvero);

        btnvolvero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(OnePiece.this, Inicio.class);
                startActivity(o);
            }
        });
    }
}