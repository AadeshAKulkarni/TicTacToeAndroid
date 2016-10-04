package com.example.dell.mytictacto;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Open extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        setTitle("TIC TAC TOE - THE GAME");
        dudum();
    }
    public void dudum(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i=new Intent("com.example.dell.mytictacto.MainActivity");
                startActivity(i);
            }

        }, 4000);
    }
}
