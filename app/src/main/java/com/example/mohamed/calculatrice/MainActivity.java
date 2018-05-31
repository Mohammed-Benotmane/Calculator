package com.example.mohamed.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText2);
        e1.setFocusable(false);
    }
    public void calcule(View v){
        switch(v.getId()){
            case R.id.un:
                e1.setText(e1.getText().toString() + "1");
                break;
            case R.id.deux:
                e1.setText(e1.getText().toString() + "2");
                break;
            case R.id.trois:
                e1.setText(e1.getText().toString() + "3");
                break;
            case R.id.quatre:
                e1.setText(e1.getText().toString() + "4");
                break;
            case R.id.cinq:
                e1.setText(e1.getText().toString() + "5");
                break;
            case R.id.six:
                e1.setText(e1.getText().toString() + "6");
                break;
            case R.id.sept:
                e1.setText(e1.getText().toString() + "7");
                break;
            case R.id.huit:
                e1.setText(e1.getText().toString() + "8");
                break;
            case R.id.neuf:
                e1.setText(e1.getText().toString() + "9");
                break;
            case R.id.zero:
                e1.setText(e1.getText().toString() + "0");
                break;
            case R.id.plus:
                e1.setText(e1.getText().toString() + "+");
                break;
            case R.id.moins:
                e1.setText(e1.getText().toString() + "-");
                break;
            case R.id.prod:
                e1.setText(e1.getText().toString() + "x");
                break;
            case R.id.div:
                e1.setText(e1.getText().toString() + "/");
                break;
            case R.id.button17:
                e1.setText("0");
                break;
            case R.id.button16:
                e1.setText(e1.getText().toString() + ".");
                break;
            case R.id.button18:
                e1.setText(e1.getText().toString() + "^");
                break;
        }

    }
    public void calcule1(View v){
        int i = 0;
        char operateur='+';
        String a="0";
        String b="0";
        while(i < e1.getText().toString().length()){
            if(String.valueOf(e1.getText().toString().charAt(i)).equals("+") || String.valueOf(e1.getText().toString().charAt(i)).equals("-") || String.valueOf(e1.getText().toString().charAt(i)).equals("x") || String.valueOf(e1.getText().toString().charAt(i)).equals("/") || String.valueOf(e1.getText().toString().charAt(i)).equals("^")) {
                b = a;
                a="0";
                operateur = e1.getText().toString().charAt(i);

            }
            else{
                a += String.valueOf(e1.getText().toString().charAt(i));


            }
            i++;
        }
        switch (operateur){
            case '+':
                e1.setText(String.valueOf(Double.parseDouble(a)+Double.parseDouble(b)));
                break;
            case '-':
                e1.setText(String.valueOf(Double.parseDouble(b)-Double.parseDouble(a)));
                break;
            case 'x':
                e1.setText(String.valueOf(Double.parseDouble(a)*Double.parseDouble(b)));
                break;
            case '/':
                e1.setText(String.valueOf(Double.parseDouble(b)/Double.parseDouble(a)));
                break;
            case '^':
                double s=1;
                for (int j = 0; j < Double.parseDouble(a); j++) {
                    s*= Double.parseDouble(b);
                }

                e1.setText(String.valueOf(s));
                break;
        }




    }
}
//e1.getText().toString() + "=" + String.valueOf(Double.parseDouble(a)+Double.parseDouble(b))