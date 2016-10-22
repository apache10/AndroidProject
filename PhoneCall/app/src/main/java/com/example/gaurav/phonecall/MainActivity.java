package com.example.gaurav.phonecall;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                call();
            }
        });
    }


    private void call() {
        
        Intent in=new Intent(Intent.ACTION_CALL, Uri.parse("tel:91-9591948826"));
        try{
            startActivity(in);
        }catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"your Activity is not founded",Toast.LENGTH_SHORT).show();
        }
    }


}
