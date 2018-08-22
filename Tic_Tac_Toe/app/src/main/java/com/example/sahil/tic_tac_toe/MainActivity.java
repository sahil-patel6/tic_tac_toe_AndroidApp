package com.example.sahil.tic_tac_toe;

import android.annotation.SuppressLint;
import android.icu.util.LocaleData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button board1;
    Button board2;
    Button board3;
    Button board4;
    Button board5;
    Button board6;
    Button board7;
    Button board8;
    Button board9;

    Button restart;

    TextView text;

    boolean stateForX = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        board1 = (Button) findViewById(R.id.board1);
        board2 = (Button) findViewById(R.id.board2);
        board3= (Button) findViewById(R.id.board3);
        board4 = (Button) findViewById(R.id.board4);
        board5 = (Button) findViewById(R.id.board5);
        board6 = (Button) findViewById(R.id.board6);
        board7 = (Button) findViewById(R.id.board7);
        board8 = (Button) findViewById(R.id.board8);
        board9 = (Button) findViewById(R.id.board9);
        restart = (Button) findViewById(R.id.restart);
        text = (TextView) findViewById(R.id.text);

        board1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board1);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        board2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board2);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        board3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board3);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        board4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board4);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        board5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board5);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        board6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board6);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        board7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board7);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        board8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board8);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        board9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText(stateForX,board9);
                if (stateForX) {
                    stateForX = false;
                    text.setText(R.string.O);
                }
                else if (!stateForX) {
                    stateForX = true;
                    text.setText(R.string.X);
                }
                else
                    Log.e("error","Error occured because of state");
                checkWinner();
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });

    }

    @SuppressLint("ResourceAsColor")
    private void displayText(boolean stateForX, Button board){

        if (stateForX){

            board.setTextColor(this.getResources().getColor(R.color.X));
            board.setText(R.string.X_board);
            board.setEnabled(false);

        }else if (!stateForX){

            board.setTextColor(this.getResources().getColor(R.color.O));
            board.setText(R.string.O_board);
            board.setEnabled(false);

        }

    }

    private void restart(){
        board1.setText("");
        board1.setEnabled(true);
        board2.setText("");
        board2.setEnabled(true);
        board3.setText("");
        board3.setEnabled(true);
        board4.setText("");
        board4.setEnabled(true);
        board5.setText("");
        board5.setEnabled(true);
        board6.setText("");
        board6.setEnabled(true);
        board7.setText("");
        board7.setEnabled(true);
        board8.setText("");
        board8.setEnabled(true);
        board9.setText("");
        board9.setEnabled(true);
        text.setText(R.string.X);
        stateForX = true;
    }

    private void checkWinner(){

        String boardOne = board1.getText().toString();
        String boardTwo = board2.getText().toString();
        String boardThree = board3.getText().toString();
        String boardFour = board4.getText().toString();
        String boardFive = board5.getText().toString();
        String boardSix = board6.getText().toString();
        String boardSeven = board7.getText().toString();
        String boardEight = board8.getText().toString();
        String boardNine = board9.getText().toString();

        String XWinner = "Player 1 is a Winner";
        String OWinner = "Player 2 is a Winner";

        if ((boardOne.equals("X")) && (boardTwo.equals("X")) && (boardThree.equals("X"))){
            text.setText(XWinner);
            disableButtons();
        }else if ((boardOne.equals("O")) && (boardTwo.equals("O")) && (boardThree.equals("O"))){
            text.setText(OWinner);
            disableButtons();
        }else if ((boardFour.equals("X")) && (boardFive.equals("X")) && (boardSix.equals("X"))){
            text.setText(XWinner);
            disableButtons();
        }else if ((boardFour.equals("O")) && (boardFive.equals("O")) && (boardSix.equals("O"))){
            text.setText(OWinner);
            disableButtons();
        }else if ((boardSeven.equals("X")) && (boardEight.equals("X")) && (boardNine.equals("X"))){
            text.setText(XWinner);
            disableButtons();
        }else if ((boardSeven.equals("O")) && (boardEight.equals("O")) && (boardNine.equals("O"))){
            text.setText(OWinner);
            disableButtons();
        }else if ((boardOne.equals("X")) && (boardFour.equals("X")) && (boardSeven.equals("X"))){
            text.setText(XWinner);
            disableButtons();
        }else if ((boardOne.equals("O")) && (boardFour.equals("O")) && (boardSeven.equals("O"))){
            text.setText(OWinner);
            disableButtons();
        }else if ((boardTwo.equals("X")) && (boardFive.equals("X")) && (boardEight.equals("X"))){
            text.setText(XWinner);
            disableButtons();
        }else if ((boardTwo.equals("O")) && (boardFive.equals("O")) && (boardEight.equals("O"))){
            text.setText(OWinner);
            disableButtons();
        }else if ((boardThree.equals("X")) && (boardSix.equals("X")) && (boardNine.equals("X"))){
            text.setText(XWinner);
            disableButtons();
        }else if ((boardThree.equals("O")) && (boardSix.equals("O")) && (boardNine.equals("O"))){
            text.setText(OWinner);
            disableButtons();
        }else if ((boardOne.equals("X")) && (boardFive.equals("X")) && (boardNine.equals("X"))){
            text.setText(XWinner);
            disableButtons();
        }else if ((boardOne.equals("O")) && (boardFive.equals("O")) && (boardNine.equals("O"))){
            text.setText(OWinner);
            disableButtons();
        }else if ((boardThree.equals("X")) && (boardFive.equals("X")) && (boardSeven.equals("X"))){
            text.setText(XWinner);
            disableButtons();
        }else if ((boardThree.equals("O")) && (boardFive.equals("O")) && (boardSeven.equals("O"))){
            text.setText(OWinner);
            disableButtons();
        }else if ( ( boardOne.equals("X") || boardOne.equals("O") ) && ( boardTwo.equals("X") || boardTwo.equals("O") )
                && ( boardThree.equals("X") || boardThree.equals("O") ) && ( boardFour.equals("X") || boardFour.equals("O") )
                && ( boardFive.equals("X") || boardFive.equals("O") ) && ( boardSix.equals("X") || boardSix.equals("O") )
                && ( boardSeven.equals("X") || boardSeven.equals("O") ) && ( boardEight.equals("X") || boardEight.equals("O") )
                && ( boardNine.equals("X") || boardNine.equals("O") ) ){
            text.setText("It is a Draw");
        }

    }

    private void disableButtons(){
        board1.setEnabled(false);
        board2.setEnabled(false);
        board3.setEnabled(false);
        board4.setEnabled(false);
        board5.setEnabled(false);
        board6.setEnabled(false);
        board7.setEnabled(false);
        board8.setEnabled(false);
        board9.setEnabled(false);
    }

}
