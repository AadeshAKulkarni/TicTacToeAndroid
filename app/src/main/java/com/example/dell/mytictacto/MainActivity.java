package com.example.dell.mytictacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static EditText e1,e2;
    private static Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("TIC TAC TOE - THE GAME");
        setContentView(R.layout.activity_main);
        listenner();
    }
    public void listenner(){
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if((e1.getText().toString().isEmpty())||(e2.getText().toString().isEmpty()))
                            Toast.makeText(MainActivity.this,"Please Enter your Names.",Toast.LENGTH_SHORT).show();
                        else
                        {
                            Intent i=new Intent("com.example.dell.mytictacto.GameActivity");
                            String text1=e1.getText().toString();
                            String text2=e2.getText().toString();
                            i.putExtra("TextBox1",text1);
                            i.putExtra("TextBox2",text2);
                            startActivity(i);
                        }
                    }
                }
        );
    }

}
