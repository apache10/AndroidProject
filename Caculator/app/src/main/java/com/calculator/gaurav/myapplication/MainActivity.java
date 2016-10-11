package com.calculator.gaurav.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //buttons
        Button mClickButtonAdd = (Button)findViewById(R.id.buttonadd);
        mClickButtonAdd.setOnClickListener(this);
        Button mClickButtonSub = (Button)findViewById(R.id.buttonsub);
        mClickButtonSub.setOnClickListener(this);
        Button mClickButtonMul = (Button)findViewById(R.id.buttonmul);
        mClickButtonMul.setOnClickListener(this);
        Button mClickButtonDiv = (Button)findViewById(R.id.buttondiv);
        mClickButtonDiv.setOnClickListener(this);
        Button mClickButtonEql = (Button)findViewById(R.id.buttoneql);
        mClickButtonEql.setOnClickListener(this);
        Button mClickButtonOne = (Button)findViewById(R.id.button1);
        mClickButtonOne.setOnClickListener(this);
        Button mClickButtonTwo = (Button)findViewById(R.id.button2);
        mClickButtonTwo.setOnClickListener(this);
        Button mClickButtonThree = (Button)findViewById(R.id.button3);
        mClickButtonThree.setOnClickListener(this);
        Button mClickButtonFour = (Button)findViewById(R.id.button4);
        mClickButtonFour.setOnClickListener(this);
        Button mClickButtonFive = (Button)findViewById(R.id.button5);
        mClickButtonFive.setOnClickListener(this);
        Button mClickButtonSix = (Button)findViewById(R.id.button6);
        mClickButtonSix.setOnClickListener(this);
        Button mClickButtonSeven = (Button)findViewById(R.id.button7);
        mClickButtonSeven.setOnClickListener(this);
        Button mClickButtonEight = (Button)findViewById(R.id.button8);
        mClickButtonEight.setOnClickListener(this);
        Button mClickButtonNine = (Button)findViewById(R.id.button9);
        mClickButtonNine.setOnClickListener(this);
        Button mClickButtonZero = (Button)findViewById(R.id.button0);
        mClickButtonZero.setOnClickListener(this);
        Button mClickButtonDot = (Button)findViewById(R.id.buttondot);
        mClickButtonDot.setOnClickListener(this);
        Button mClickButtonC = (Button)findViewById(R.id.buttonc);
        mClickButtonC.setOnClickListener(this);


    }
    //onClick
    public void onClick(View v) {
        String equations=null;
        switch (v.getId()) {
            case  R.id.buttonadd: {
                // do something for button 1 click
                equations = equations+ '+';
                break;
            }

            case R.id.buttonsub: {
                // do something for button 2 click
                equations = equations+ '-';

                break;
            }

            case R.id.buttonmul : {
                // do something for button  click
                equations = equations+'*';
                break;
            }

            case R.id.buttondiv: {
                // do something for button 2 click
                equations = equations+'/';
                break;
            }

            case R.id.button0: {
                // do something for button 2 click
                equations = equations+'0';
                break;
            }

            case R.id.button1: {
                // do something for button 2 click
                equations = equations+'1';
                break;
            }

            case R.id.button2: {
                // do something for button 2 clic
                equations = equations+'2';
                break;
            }

            case R.id.button3: {
                // do something for button 2 click
                equations = equations+'3';
                break;
            }

            case R.id.button4: {
                // do something for button 2 click
                equations = equations+'4';
                break;
            }

            case R.id.button5: {
                // do something for button 2 click
                equations = equations+'5';
                break;
            }

            case R.id.button6: {
                // do something for button 2 click
                equations = equations+'6';
                break;
            }

            case R.id.button7: {
                // do something for button 2 click
                equations = equations+'7';
                break;
            }

            case R.id.button8: {
                // do something for button 2 click
                equations = equations+'8';
                break;
            }

            case R.id.button9: {
                // do something for button 2 click
                equations = equations+'9';
                break;
            }

            case R.id.buttondot: {
                // do something for button 2 click
                equations = equations+'.';
                break;
            }

            case R.id.buttonc: {
                // do something for button 2 click
                equations = null;
                break;
            }

            case R.id.buttoneql: {
                // do something for button 2 click

                break;
            }
        }
    }

}
