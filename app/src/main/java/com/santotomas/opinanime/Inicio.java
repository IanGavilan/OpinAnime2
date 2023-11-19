package com.santotomas.opinanime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Inicio extends AppCompatActivity {

    ImageButton imgop;

    ImageButton imgbc;

    ImageButton imgmha;

    ImageButton imgaot;

    ImageButton imgvs;

    ImageButton imgcoe;

    Button btnIS;

    Button CerrarSesion;

    FirebaseUser firebaseUser;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        imgop = (ImageButton) findViewById(R.id.img_op);
        imgbc = (ImageButton) findViewById(R.id.img_bc);
        imgmha = (ImageButton) findViewById(R.id.img_mha);
        imgaot = (ImageButton) findViewById(R.id.img_snk);
        imgvs = (ImageButton) findViewById(R.id.img_vs);
        imgcoe = (ImageButton) findViewById(R.id.img_coe);
        btnIS = findViewById(R.id.btnIS);
        CerrarSesion = findViewById(R.id.btncs);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();

        CerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CerrarSesion();

            }
        });

        btnIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is = new Intent(Inicio.this, MainActivity.class);
                startActivity(is);
            }
        });

        imgcoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coe = new Intent(Inicio.this, ClassroomOfTheElite.class);
                startActivity(coe);
            }
        });


        imgvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sv = new Intent(Inicio.this, VnlandSaga.class);
                startActivity(sv);
            }
        });


        imgaot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aot = new Intent(Inicio.this, AttackOnTitan.class);
                startActivity(aot);
            }
        });
        imgmha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mha = new Intent(Inicio.this, MyHeroAcademia.class);
                startActivity(mha);
            }
        });


        imgbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bc = new Intent(Inicio.this, BlackClover.class);
                startActivity(bc);
            }
        });

        imgop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op = new Intent(Inicio.this, OnePiece.class);
                startActivity(op);
            }
        });
    }

    private void CerrarSesion() {
        firebaseAuth.signOut();
        Toast.makeText(this, "Ha cerrado sesión", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Inicio.this, Inicio.class));

    }
}