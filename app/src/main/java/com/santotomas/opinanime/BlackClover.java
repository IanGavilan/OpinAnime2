package com.santotomas.opinanime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BlackClover extends AppCompatActivity {

    Button btnvolverbc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_clover);
        btnvolverbc = findViewById(R.id.btn_volverbc);

        btnvolverbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bc = new Intent(BlackClover.this, Inicio.class);
                startActivity(bc);
            }
        });
    }
}