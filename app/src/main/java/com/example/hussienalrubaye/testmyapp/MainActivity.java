package com.example.hussienalrubaye.testmyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
int Attemp=0;
    public void Login(View view) {
        EditText UserName=(EditText)findViewById(R.id.etUserName);
        EditText Password=(EditText)findViewById(R.id.etPassword);
        Attemp++; //number of attemps
        if (Attemp>=3){
            Toast.makeText(getApplicationContext(),"to many try",Toast.LENGTH_LONG).show();
        }
        if (UserName.getText().toString().equals("admin") && Password.getText().toString().equals("admin") )

            Toast.makeText(getApplicationContext(),"Thank you for login",Toast.LENGTH_LONG).show();
    else
            Toast.makeText(getApplicationContext(),"User name or password isnot correct",Toast.LENGTH_LONG).show();


    }
}
