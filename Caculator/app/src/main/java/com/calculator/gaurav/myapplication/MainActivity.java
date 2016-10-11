package com.calculator.gaurav.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

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

        switch (v.getId()) {
            case  R.id.buttonadd: {
                // do something for button 1 click
                TextView textView= (TextView) findViewById(R.id.textView);
                textView.append("+");
                break;
            }

            case R.id.buttonsub: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("-");
                break;
            }

            case R.id.buttonmul : {
                // do something for button  click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("*");
                break;
            }

            case R.id.buttondiv: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("/");
                break;
            }

            case R.id.button0: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("0");
                break;
            }

            case R.id.button1: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("1");
                break;
            }

            case R.id.button2: {
                // do something for button 2 clic
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("2");
                break;
            }

            case R.id.button3: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("3");
                break;
            }

            case R.id.button4: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("4");
                break;
            }

            case R.id.button5: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("5");
                break;
            }

            case R.id.button6: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("6");
                break;
            }

            case R.id.button7: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("7");
                break;
            }

            case R.id.button8: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("8");
                break;
            }

            case R.id.button9: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append("9");
                break;
            }

            case R.id.buttondot: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.append(".");
                break;
            }

            case R.id.buttonc: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("");
                break;
            }

            case R.id.buttoneql: {
                // do something for button 2 click
                TextView textView = (TextView) findViewById(R.id.textView);
                Log.d("Eval  " , textView.toString());
                final String str = textView.getText().toString();
                Log.d("Eval  " , str);
                double result = 0;
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                try {
                    result = eval(str);
                    textView2.setText(Double.toString(result));

                } catch (Exception e) {
                    e.printStackTrace();
                    textView2.setText("syntax error");
                }
                break;
            }
        }
    }

    //evaluate
    public static double eval(final String str) throws Exception {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}
