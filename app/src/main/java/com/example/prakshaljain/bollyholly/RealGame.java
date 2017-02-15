package com.example.prakshaljain.bollyholly;

import android.content.DialogInterface;
import android.graphics.Movie;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RealGame extends AppCompatActivity {

    public TextView MovieDisplay,gametypedisplay;
    String movie,teama,teamb,gametype;
    String movieNamef,guessName;
    char[] chararray;
    int length;
    Button q,w,r,t,y,p,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_game);

        String test = "test";

        test = test.replace("t","piyush");

        Log.d("test", "onCreate: "+test);

        Bundle GetMovie=getIntent().getExtras();
        gametypedisplay=(TextView)findViewById(R.id.gametype);
        q=(Button)findViewById(R.id.q);
        w=(Button)findViewById(R.id.w);
        r=(Button)findViewById(R.id.r);
        t=(Button)findViewById(R.id.t);
        y=(Button)findViewById(R.id.y);
        p=(Button)findViewById(R.id.p);
        s=(Button)findViewById(R.id.s);
        d=(Button)findViewById(R.id.d);
        f=(Button)findViewById(R.id.f);
        g=(Button)findViewById(R.id.g);
        h=(Button)findViewById(R.id.h);
        j=(Button)findViewById(R.id.j);
        k=(Button)findViewById(R.id.k);
        l=(Button)findViewById(R.id.l);
        z=(Button)findViewById(R.id.z);
        x=(Button)findViewById(R.id.x);
        c=(Button)findViewById(R.id.c);
        v=(Button)findViewById(R.id.v);
        b=(Button)findViewById(R.id.b);
        n=(Button)findViewById(R.id.n);
        m=(Button)findViewById(R.id.m);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button)findViewById(R.id.b0);
        q.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('q',view);
                    }
                }
        );
        w.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('w',view);
                    }
                }
        );
        r.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('r',view);
                    }
                }
        );
        t.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('t',view);
                    }
                }
        );
        y.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('y',view);
                    }
                }
        );
        p.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('p',view);
                    }
                }
        );
        s.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('s',view);
                    }
                }
        );
        d.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('d',view);
                    }
                }
        );
        f.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('f',view);
                    }
                }
        );
        g.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('g',view);
                    }
                }
        );
        h.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('h',view);
                    }
                }
        );
        j.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('j',view);
                    }
                }
        );
        k.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('k',view);
                    }
                }
        );
        l.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('l',view);
                    }
                }
        );
        z.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('z',view);
                    }
                }
        );
        x.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('x',view);
                    }
                }
        );
        c.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('c',view);
                    }
                }
        );
        v.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('v',view);
                    }
                }
        );
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('b',view);
                    }
                }
        );
        n.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('n',view);
                    }
                }
        );
        m.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('m',view);
                    }
                }
        );
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('1',view);
                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('2',view);
                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('3',view);
                    }
                }
        );
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('4',view);
                    }
                }
        );
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('5',view);
                    }
                }
        );
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('6',view);
                    }
                }
        );
        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('7',view);
                    }
                }
        );
        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('8',view);
                    }
                }
        );
        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('9',view);
                    }
                }
        );
        b0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclick('0',view);
                    }
                }
        );

        teama=GetMovie.getString("teama");
        teamb=GetMovie.getString("teamb");
        gametype=GetMovie.getString("gametype");
        movie = GetMovie.getString("moviename");
        gametypedisplay.setText(gametype.toUpperCase());
        length=movie.length();
        MovieDisplay=(TextView)findViewById(R.id.MovieDisplay);
        MovieDisplay.setTextSize(40);
        chararray=movie.toCharArray();
        for(int i=0;i<length; i++)
        {
            if(chararray[i]!='e'&&chararray[i]!='a'&&chararray[i]!='i'&&chararray[i]!='o'&&chararray[i]!='u'&&chararray[i]!=' ')
                chararray[i]='_';
        }
        guessName = setMovie(movie);
        chararray = guessName.toCharArray();
        MovieDisplay.setText(setMovie(movie));
//        MovieDisplay.setText(new String(chararray));
    }
    int count = 0;
    public void onclick(char x,View v)
    {
        int flag=0;


        for(int i=0;i<movieNamef.length(); i++)
        {
            if(movieNamef.charAt(i)==x)
            {
                flag=1;
                chararray[i]=x;
            }
        }
        if(flag==0)
        {
            count++;
            if(count==9){
                gameOver("lose");
            }
            v.setBackgroundColor(0xFFFF0000);
            v.setEnabled(false);
        }
        else
        {
            v.setBackgroundColor(0xFF00FF00);
            v.setEnabled(false);
        }
        MovieDisplay.setText(new String(chararray));

        if(!(new String(chararray)).contains("_")){
            gameOver("won");
        }

    }

    private void gameOver(String result) {

        if(result.equals("lose")){
            Toast.makeText(getApplicationContext(),"TRY AGAIN",Toast.LENGTH_LONG).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(RealGame.this);
            alert.setTitle("You Lose");
            alert.setMessage("Continue");
            alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    onBackPressed();
                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alert.show();
        } else if (result.equals("won")){
            Toast.makeText(getApplicationContext(),"CONGO",Toast.LENGTH_LONG).show();

            AlertDialog.Builder alert = new AlertDialog.Builder(RealGame.this);
            alert.setTitle("You Won");
            alert.setMessage("Continue");
            alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    onBackPressed();
                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alert.show();
        }
    }

    public String setMovie(String movieName){
        int i = 0;

        Log.d("lolol", "setMovie: here");

        movieName = movieName.replace(" "," / ");

         movieNamef = movieName;

        movieName = movieName+'@';

//        for(i=0;i<movieNamef.length();i++)
        while (movieName.charAt(i)!='@')
        {
            char x = movieName.charAt(i);
            i++;
            if (x != 'e' && x != 'a' && x != 'i' && x != 'o' && x != 'u' && x != ' ' && x!= '/' && x!='_')
            {
                Log.d("lolol", "setMovie: here" + x);
                movieName = movieName.replace(x + "", " _ ");
                movieNamef = movieNamef.replace(x+""," "+x+" ");

                Log.d("lolol", "setMovie: here"+ movieName + movieNamef);
            }

        }

    return movieName.replace("@","");
    }
}
