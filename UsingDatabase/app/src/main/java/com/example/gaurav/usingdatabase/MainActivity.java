package com.example.gaurav.usingdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button logIn = (Button)findViewById(R.id.login);
        Button signUp = (Button)findViewById(R.id.signup);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.log_in);
                Toast.makeText(getApplicationContext(), "logIn", Toast.LENGTH_SHORT).show();
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.sign_up);
                Toast.makeText(getApplicationContext(), "SingUp", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
