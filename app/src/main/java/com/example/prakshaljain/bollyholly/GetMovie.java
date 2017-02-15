package com.example.prakshaljain.bollyholly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GetMovie extends AppCompatActivity {

    EditText text;
    String teama,teamb,gametype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_movie);
        Bundle teamnames= getIntent().getExtras();
        teama=teamnames.getString("teama");
        teamb=teamnames.getString("teamb");
        gametype=teamnames.getString("gametype");
        Button moviedone=(Button)findViewById(R.id.moviedone);
        text= (EditText)findViewById(R.id.movietext);
        moviedone.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        clicked();
                        text.setText("");
                    }
                }
        );
    }

        public void clicked()
        {
            Intent i=  new Intent(this,RealGame.class);
            String movie= text.getText().toString();
            i.putExtra("gametype",gametype);
            i.putExtra("teama",teama);
            i.putExtra("teamb",teamb);
            i.putExtra("moviename",movie);
            startActivity(i);
        }

}
