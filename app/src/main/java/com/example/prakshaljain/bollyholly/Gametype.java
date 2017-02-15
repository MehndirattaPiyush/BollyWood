package com.example.prakshaljain.bollyholly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gametype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_type);
        Button holly =(Button)findViewById(R.id.hollywood);
        Button bolly =(Button)findViewById(R.id.bollywood);
        holly.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Clicked("hollywood");
                    }
                }
        );
        bolly.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Clicked("bollywood");
                    }
                }
        );
    }
    public void Clicked(String str)
    {
        Intent i= new Intent(this,TeamName.class);
        i.putExtra("gameType",str);
        startActivity(i);
    }
    //on back pressed update
}
