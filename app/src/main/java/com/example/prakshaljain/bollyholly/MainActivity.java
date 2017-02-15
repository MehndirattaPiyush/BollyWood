package com.example.prakshaljain.bollyholly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button single;
    Button multi;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        single=(Button)findViewById(R.id.single);
        multi=(Button)findViewById(R.id.multi);
        intent= new Intent(this,Gametype.class);
        single.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        startActivity(intent);
                    }
                }
        );
    }
}
