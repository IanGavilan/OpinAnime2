package com.santotomas.opinanime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyHeroAcademia extends AppCompatActivity {

    Button btnvolvermha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_hero_academia);
        btnvolvermha = findViewById(R.id.btn_volvermha);

        btnvolvermha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mha = new Intent(MyHeroAcademia.this, Inicio.class);
                startActivity(mha);
            }
        });
    }
}