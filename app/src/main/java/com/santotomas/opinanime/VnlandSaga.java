package com.santotomas.opinanime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VnlandSaga extends AppCompatActivity {

    Button btnvolvervs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vnland_saga);
        btnvolvervs = findViewById(R.id.btn_volvervs);

        btnvolvervs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vs = new Intent(VnlandSaga.this, Inicio.class);
                startActivity(vs);
            }
        });
    }
}