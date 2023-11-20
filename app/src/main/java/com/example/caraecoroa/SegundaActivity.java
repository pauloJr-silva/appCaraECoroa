package com.example.caraecoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SegundaActivity extends AppCompatActivity {

    private ImageView imgMoeda;
    private ImageButton imgVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imgMoeda = findViewById(R.id.imgMoeda);
        imgVoltar = findViewById(R.id.imgVoltar);


        //recuperando dados da activity main
        Bundle dados = getIntent().getExtras();

        int numSorteado = dados.getInt("numSorteado");

        if (numSorteado == 0){
            imgMoeda.setImageResource(R.drawable.moeda_cara);
        }else {
            imgMoeda.setImageResource(R.drawable.moeda_coroa);
        }

        imgVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            }
        });


    }
}