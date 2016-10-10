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
    }
    //numbers button
    Button.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Take action.
        }
    });
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
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.buttonadd: {
                // do something for button 1 click
                break;
            }

            case R.id.buttonsub: {
                // do something for button 2 click
                break;
            }

            case R.id.buttonmul : {
                // do something for button 2 click
                break;
            }

            case R.id.buttondiv: {
                // do something for button 2 click
                break;
            }

            case R.id.buttoneql: {
                // do something for button 2 click
                break;
            }
        }
    }
}
