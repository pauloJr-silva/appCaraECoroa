package com.example.caraecoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgJogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgJogar = findViewById(R.id.imgJogar);

        imgJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //crain
                Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);

                int numSorteado = new Random().nextInt(2);

                intent.putExtra("numSorteado",numSorteado);
                startActivity(intent);
            }
        });
    }
}