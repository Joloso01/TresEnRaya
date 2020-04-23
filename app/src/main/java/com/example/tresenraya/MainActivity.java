package com.example.tresenraya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, br;
    String turno ="X";
    int numturno = 0;
    int victoriaJ1 = 0;
    EditText textoJ1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        br = findViewById(R.id.buttonR);
        textoJ1= findViewById(R.id.editText5);
        resetButtons();
    }

    public void ButtonReset(View view){
        resetButtons();
    }

    public void click(View view){
        boolean clickado=false;
        switch (view.getId()){
            case R.id.button1:
                if(b1.getText().toString().isEmpty()) {
                    b1.setText(turno);
                    clickado = true;
                }
                break;
            case R.id.button2:
                if(b2.getText().toString().isEmpty()) {
                    b2.setText(turno);
                    clickado = true;
                }
                break;
            case R.id.button3:
                if(b3.getText().toString().isEmpty()) {
                    b3.setText(turno);
                    clickado = true;
                }
                break;
            case R.id.button4:
                if(b4.getText().toString().isEmpty()) {
                    b4.setText(turno);
                    clickado = true;
                }
                break;
            case R.id.button5:
                if(b5.getText().toString().isEmpty()) {
                    b5.setText(turno);
                    clickado = true;
                }
                break;
            case R.id.button6:
                if(b6.getText().toString().isEmpty()) {
                    b6.setText(turno);
                    clickado = true;
                }
                break;
            case R.id.button7:
                if(b7.getText().toString().isEmpty()) {
                    b7.setText(turno);
                    clickado = true;
                }
                break;
            case R.id.button8:
                if(b8.getText().toString().isEmpty()) {
                    b8.setText(turno);
                    clickado = true;
                }
                break;
            case R.id.button9:
                if(b9.getText().toString().isEmpty()) {
                    b9.setText(turno);
                    clickado = true;
                }
                break;
        }

        if(clickado){
            comprobarGanador();
            turno = turno.equals("X") ? "O" : "X";
            numturno=numturno+1;
        }
    }

    void resetButtons(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        numturno=0;

        turno = "X";
    }

    void comprobarGanador(){
        if((b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")) || (b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) || (b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")) || (b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) || (b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) ||(b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) )
        {
            Toast toast = Toast.makeText(this,"El jugador X Gana!!", Toast.LENGTH_LONG);
            toast.show();
            resetButtons();
            victoriaJ1=victoriaJ1+1;
            turno="X";
            textoJ1.setText(victoriaJ1);
        }else if ((b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")) || (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")) || (b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")) || (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")) || (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")) ||(b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O"))){
            Toast toast = Toast.makeText(this,"El jugador O Gana!!", Toast.LENGTH_LONG);
            toast.show();
            resetButtons();
            turno="X";

        }else if(numturno >= 8){
            Toast toast = Toast.makeText(this,"Empate!!", Toast.LENGTH_LONG);
            toast.show();
            resetButtons();
        }
    }
}
