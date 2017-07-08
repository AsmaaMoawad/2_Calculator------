package com.example.asmaa.as2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show=(TextView)findViewById(R.id.textView3);

    }

    public void Click(View view){
        String btn_1=((Button)view).getText().toString();
        String btn_2=((Button)view).getText().toString();
        String btn_3=((Button)view).getText().toString();
        String btn_4=((Button)view).getText().toString();
        String btn_5=((Button)view).getText().toString();
        String btn_6=((Button)view).getText().toString();
        String btn_7=((Button)view).getText().toString();
        String btn_8=((Button)view).getText().toString();
        String btn_9=((Button)view).getText().toString();
        String btn_0=((Button)view).getText().toString();
        String btn_sum=((Button)view).getText().toString();
        String btn_sub=((Button)view).getText().toString();



        if(btn_1.equals("1")){
            show.append("1");
        }

        else  if(btn_2.equals("2")){
            show.append("2");
        }

        else  if(btn_3.equals("3")){
            show.append("3");
        }

        else  if(btn_4.equals("4")){
            show.append("4");
        }

        else  if(btn_5.equals("5")){
            show.append("5");
        }

        else  if(btn_6.equals("6")){
            show.append("6");
        }

        else  if(btn_7.equals("7")){
            show.append("7");
        }

        else  if(btn_8.equals("8")){
            show.append("8");
        }

        else  if(btn_9.equals("9")){
            show.append("9");
        }
        else  if(btn_0.equals("0")){
            show.append("0");
        }
        else  if(btn_sum.equals("+")){
            show.append("+");
        }
        else  if(btn_sub.equals("-")){
            show.append("-");
        }

    }
   // public String substring(int startIndex, int endIndex):


    public void RES(View view){
        String btn_eq=((Button)view).getText().toString();
        if(btn_eq.equals("=")){
         String input =show.getText().toString();


        }





    }





}
