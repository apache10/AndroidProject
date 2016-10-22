package com.example.gaurav.phonecall;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =(Button)findViewById(R.id.button);
        Button b2 =(Button)findViewById(R.id.sendSMS);
        final EditText text = (EditText) findViewById(R.id.editText);

        Log.d("num",""+text.getText().toString());

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                call(text);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendSMSMessage(text);
            }
        });


    }


    private void call(EditText text) {
        Intent in=new Intent(Intent.ACTION_CALL, Uri.parse("tel:91-"+text.getText().toString()));
        try{
            startActivity(in);
        }catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"your Activity is not founded",Toast.LENGTH_SHORT).show();
        }
    }

    protected void sendSMSMessage(EditText text) {
        EditText txtMessage = (EditText) findViewById(R.id.editText2);
        Log.i("Send SMS", "");
        String phoneNo = text.getText().toString();
        String message = txtMessage.getText().toString();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
        }

        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS faild, please try again.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }


}
