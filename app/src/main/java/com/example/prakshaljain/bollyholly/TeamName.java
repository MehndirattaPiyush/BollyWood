package com.example.prakshaljain.bollyholly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TeamName extends AppCompatActivity {
    EditText teama,teamb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_name);
        Bundle gameType= getIntent().getExtras();
        final String gametype= gameType.getString("gameType");
        Button done= (Button)findViewById(R.id.teamdone);
        teama=(EditText)findViewById(R.id.teamaname);
        teamb=(EditText)findViewById(R.id.teambname);
        done.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Clicked(gametype,teama.getText().toString(),teamb.getText().toString());
                    }
                }
        );
    }
    public void Clicked(String str,String teama,String teamb)
    {
        Intent i= new Intent(this,GetMovie.class);
        i.putExtra("gametype",str);
        i.putExtra("teama",teama);
        i.putExtra("teamb",teamb);
        startActivity(i);
    }
}
