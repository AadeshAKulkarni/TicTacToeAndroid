package com.example.dell.mytictacto;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private TextView t1,t2,t3,t4,t5,t6,t10;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b12;
    int round=1,draw=0,turn=1,p1=0,p2=0;
    private int tictac[][]=new int[3][3];
    private int nextmatchturn=1;
    private boolean flag=false;
    String text1,text2,player1,player2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("TIC TAC TOE - THE GAME");
        setContentView(R.layout.activity_game);
        t1=(TextView)findViewById(R.id.textView3);
        t1.setText(Integer.toString(round));

        t2=(TextView)findViewById(R.id.textView4);
        t3=(TextView)findViewById(R.id.textView6);
        Intent ii = getIntent();
        text1 = ii.getStringExtra("TextBox1");
        t2.setText(text1);
        text2 = ii.getStringExtra("TextBox2");
        t3.setText(text2);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView7);
        t5.setText(Integer.toString(p1));
        t6.setText(Integer.toString(p2));
        t4=(TextView)findViewById(R.id.textView9);
        t4.setText(Integer.toString(draw));

        t10=(TextView)findViewById(R.id.textView10);

        //t10.setText(text1+"'s Turn");
        xyz();
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                tictac[i][j]=0;
        onClickLisn1();
        onClickLisn2();
        onClickLisn3();
        onClickLisn4();
        onClickLisn5();
        onClickLisn6();
        onClickLisn7();
        onClickLisn8();
        onClickLisn9();
        restarter();
    }
    public void xyz()
    {
        if(turn%2==1)
        {
            if(nextmatchturn%2==1)
            {
                t10.setText(text1+"'s Turn ( X )");
                player1=text1;
                player2=text2;
            }
            else
            {
                t10.setText(text2+"'s Turn ( X )");
                player1=text2;
                player2=text1;
            }
        }
        else
        {
            if(nextmatchturn%2==1)
            {
                t10.setText(text2 + "'s Turn ( O )");
                player1=text1;
                player2=text2;
            }
            else {

                t10.setText(text1 + "'s Turn ( O )");
                player1=text2;
                player2=text1;
            }
        }
    }
    public void  restarter(){
        b12=(Button)findViewById(R.id.button12);
        b12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flag=true;
                        resetter();
                        flag=false;
                    }
                }
        );
    }
    public void onClickLisn1() {
        b1 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b1.setText("X");
                            tictac[0][0]=1;
                        } else {
                            b1.setText("O");
                            tictac[0][0]=2;
                        }
                        b1.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );

    }
    public void onClickLisn2() {
        b2 = (Button) findViewById(R.id.button3);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b2.setText("X");
                            tictac[0][1]=1;
                        } else {
                            b2.setText("O");
                            tictac[0][1]=2;
                        }
                        b2.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );

    }
    public void onClickLisn3() {
        b3 = (Button) findViewById(R.id.button4);
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b3.setText("X");
                            tictac[0][2]=1;
                        } else {
                            b3.setText("O");
                            tictac[0][2]=2;
                        }
                        b3.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );

    }
    public void onClickLisn4() {
        b4 = (Button) findViewById(R.id.button5);
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b4.setText("X");
                            tictac[1][0]=1;
                        } else {
                            b4.setText("O");
                            tictac[1][0]=2;
                        }
                        b4.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );

    }
    public void onClickLisn5() {
        b5 = (Button) findViewById(R.id.button6);
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b5.setText("X");
                            tictac[1][1]=1;
                        } else {
                            b5.setText("O");
                            tictac[1][1]=2;
                        }
                        b5.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );

    }
    public void onClickLisn6() {
        b6 = (Button) findViewById(R.id.button7);
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b6.setText("X");
                            tictac[1][2]=1;
                        } else {
                            b6.setText("O");
                            tictac[1][2]=2;
                        }
                        b6.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );

    }
    public void isDraw(){
        if(turn>9)
        {
            AlertDialog.Builder a_dialog=new AlertDialog.Builder(this);
            a_dialog.setMessage("Stalemate. Its a Draw.").setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    resetter();
                }
            });
            AlertDialog alert=a_dialog.create();
            alert.setTitle("Draw!");
            alert.show();
            draw++;
            t4.setText(Integer.toString(draw));
            resetter();
            nextmatchturn++;
            round++;
        }
    }
    public void onClickLisn7() {
        b7 = (Button) findViewById(R.id.button8);
        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b7.setText("X");
                            tictac[2][0]=1;
                        } else {
                            b7.setText("O");
                            tictac[2][0]=2;
                        }
                        b7.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );

    }
    public void onClickLisn8() {
        b8 = (Button) findViewById(R.id.button9);
        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b8.setText("X");
                            tictac[2][1]=1;
                        } else {
                            b8.setText("O");
                            tictac[2][1]=2;
                        }
                        b8.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );

    }
    public void onClickLisn9() {
        b9 = (Button) findViewById(R.id.button10);
        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (turn % 2 == 1) {
                            b9.setText("X");
                            tictac[2][2]=1;
                        } else {
                            b9.setText("O");
                            tictac[2][2]=2;
                        }
                        b9.setEnabled(false);
                        turn++;
                        xyz();
                        isDraw();
                        checkWin();

                    }
                }
        );
    }
    public void checkWin(){
        if(((tictac[0][0]==1)&&(tictac[0][1]==1)&&(tictac[0][2]==1))||((tictac[1][0]==1)&&(tictac[1][1]==1)&&(tictac[1][2]==1))||((tictac[2][0]==1)&&(tictac[2][1]==1)&&(tictac[2][2]==1)))
        {
            if(player1.equals(text1)) {
                p1++;
                t5.setText(Integer.toString(p1));
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage(t2.getText().toString() + " Wins Round " + round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
            else
            {
                p2++;
                t6.setText(Integer.toString(p2));
                AlertDialog.Builder a_dialog=new AlertDialog.Builder(this);
                a_dialog.setMessage(t3.getText().toString()+" Wins Round "+round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert=a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
            //Player 1 Wins
            //Player1++; setText();
        }
        else if(((tictac[0][0]==2)&&(tictac[0][1]==2)&&(tictac[0][2]==2))||((tictac[1][0]==2)&&(tictac[1][1]==2)&&(tictac[1][2]==2))||((tictac[2][0]==2)&&(tictac[2][1]==2)&&(tictac[2][2]==2)))
        {
            // Player 2 Wins
            //Player2++; setText();
            if(player1.equals(text1)) {
                p1++;
                t5.setText(Integer.toString(p1));
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage(t2.getText().toString() + " Wins Round " + round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
            else
            {
                p2++;
                t6.setText(Integer.toString(p2));
                AlertDialog.Builder a_dialog=new AlertDialog.Builder(this);
                a_dialog.setMessage(t3.getText().toString()+" Wins Round "+round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert=a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
        }
        if(((tictac[0][0]==1)&&(tictac[1][0]==1)&&(tictac[2][0]==1))||((tictac[0][1]==1)&&(tictac[1][1]==1)&&(tictac[2][1]==1))||((tictac[0][2]==1)&&(tictac[1][2]==1)&&(tictac[2][2]==1)))
        {
            if(player1.equals(text1)) {
                p1++;
                t5.setText(Integer.toString(p1));
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage(t2.getText().toString() + " Wins Round " + round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
            else
            {
                p2++;
                t6.setText(Integer.toString(p2));
                AlertDialog.Builder a_dialog=new AlertDialog.Builder(this);
                a_dialog.setMessage(t3.getText().toString()+" Wins Round "+round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert=a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }                //Player 1 Wins
            //Player1++; setText();

        }
        else if(((tictac[0][0]==2)&&(tictac[1][0]==2)&&(tictac[2][0]==2))||((tictac[0][1]==2)&&(tictac[1][1]==2)&&(tictac[2][1]==2))||((tictac[0][2]==2)&&(tictac[1][2]==2)&&(tictac[2][2]==2)))
        {
            // Player 2 Wins
            //Player2++; setText();
            if(player1.equals(text1)) {
                p1++;
                t5.setText(Integer.toString(p1));
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage(t2.getText().toString() + " Wins Round " + round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
            else
            {
                p2++;
                t6.setText(Integer.toString(p2));
                AlertDialog.Builder a_dialog=new AlertDialog.Builder(this);
                a_dialog.setMessage(t3.getText().toString()+" Wins Round "+round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert=a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
        }
        else if(((tictac[0][0]==1)&&(tictac[1][1]==1)&&(tictac[2][2]==1))||((tictac[0][2]==1)&&(tictac[1][1]==1)&&(tictac[2][0]==1)))
        {
            if(player1.equals(text1)) {
                p1++;
                t5.setText(Integer.toString(p1));
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage(t2.getText().toString() + " Wins Round " + round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
            else
            {
                p2++;
                t6.setText(Integer.toString(p2));
                AlertDialog.Builder a_dialog=new AlertDialog.Builder(this);
                a_dialog.setMessage(t3.getText().toString()+" Wins Round "+round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert=a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
                //Player 1 Wins
            //Player1++; setText();
        }
        else  if(((tictac[0][0]==2)&&(tictac[1][1]==2)&&(tictac[2][2]==2))||((tictac[0][2]==2)&&(tictac[1][1]==2)&&(tictac[2][0]==2)))
        {
            // Player 2 Wins
            //Player2++; setText();
            if(player1.equals(text1)) {
                p1++;
                t5.setText(Integer.toString(p1));
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage(t2.getText().toString() + " Wins Round " + round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
            else
            {
                p2++;
                t6.setText(Integer.toString(p2));
                AlertDialog.Builder a_dialog=new AlertDialog.Builder(this);
                a_dialog.setMessage(t3.getText().toString()+" Wins Round "+round).setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        resetter();
                    }
                });
                AlertDialog alert=a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
                round++;
                t1.setText(Integer.toString(round));
            }
        }
        if(round>=6)
        {
            if(p1>p2) {
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage(t2.getText().toString() + " Wins by "+(p1-p2)+" Games.").setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        round=1;
                       p1=0;p2=0;draw=0;
                        t5=(TextView)findViewById(R.id.textView5);
                        t6=(TextView)findViewById(R.id.textView7);
                        t5.setText(Integer.toString(p1));
                        t6.setText(Integer.toString(p2));
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
            }
            else if(p2>p1){
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage(t3.getText().toString() + " Wins by "+(p2-p1)+" Games.").setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        round=1;
                        p1=0;p2=0;draw=0;
                        t5=(TextView)findViewById(R.id.textView5);
                        t6=(TextView)findViewById(R.id.textView7);
                        t5.setText(Integer.toString(p1));
                        t6.setText(Integer.toString(p2));
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Win!");
                alert.show();
            }
            else
            {
                AlertDialog.Builder a_dialog = new AlertDialog.Builder(this);
                a_dialog.setMessage("After "+(round-1)+" Rounds, Its a Stalemate.").setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        round=1;
                        p1=0;p2=0;draw=0;
                        t5=(TextView)findViewById(R.id.textView5);
                        t6=(TextView)findViewById(R.id.textView7);
                        t5.setText(Integer.toString(p1));
                        t6.setText(Integer.toString(p2));
                        resetter();
                    }
                });
                AlertDialog alert = a_dialog.create();
                alert.setTitle("Draw");
                alert.show();
            }
        }
    }
    public void resetter(){

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                tictac[i][j]=0;
        b1 = (Button) findViewById(R.id.button2);
        b1.setText("");
        b1.setEnabled(true);

        b2 = (Button) findViewById(R.id.button3);
        b2.setText("");
        b2.setEnabled(true);

        b3 = (Button) findViewById(R.id.button4);
        b3.setText("");
        b3.setEnabled(true);

        b4 = (Button) findViewById(R.id.button5);
        b4.setText("");
        b4.setEnabled(true);

        b5 = (Button) findViewById(R.id.button6);
        b5.setText("");
        b5.setEnabled(true);

        b6 = (Button) findViewById(R.id.button7);
        b6.setText("");
        b6.setEnabled(true);

        b7 = (Button) findViewById(R.id.button8);
        b7.setText("");
        b7.setEnabled(true);

        b8 = (Button) findViewById(R.id.button9);
        b8.setText("");
        b8.setEnabled(true);

        b9 = (Button) findViewById(R.id.button10);
        b9.setText("");
        b9.setEnabled(true);

        turn=1;
        if(!flag)
            nextmatchturn++;
        xyz();
    }
}
