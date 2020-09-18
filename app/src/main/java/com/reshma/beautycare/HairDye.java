package com.reshmaharidhas.reshma.beautycare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HairDye extends AppCompatActivity {
Button buttonprecaution;
    Button buttonherbaldye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_dye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonprecaution=(Button)findViewById(R.id.button1hairdye);
        buttonherbaldye=(Button)findViewById(R.id.button2hairdye);

        buttonprecaution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HairDye.this,HairdyePrecaution.class);
                startActivity(intent);
            }
        });

        buttonherbaldye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HairDye.this,HerbalHairdye.class);
                startActivity(intent);
            }
        });

    }

}
