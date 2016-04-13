package com.login;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
   Button Login, Back;
    EditText USERNAME, USERPASS;
    String username, userpass; //to host the data retrived from the database
    Context CTX = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        Login = (Button)findViewById(R.id.user_log);
        USERNAME = (EditText) findViewById(R.id.user_name);
        USERPASS = (EditText) findViewById(R.id.user_pass);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = USERNAME.getText().toString();
                userpass = USERPASS.getText().toString();
DatabaseOperation db = new DatabaseOperation(CTX);
                Cursor CR = db.getInformation(db);
                CR.moveToFirst();
                boolean log_status = false;
                String Name = "";
                do{
                    if(username.equals(CR.getString(0)) && userpass.equals(CR.getString(1)))
                    {
                        log_status = true;
                        Name = CR.getString(0);
                    }
                }while(CR.moveToNext());
                if(log_status){
                    Toast.makeText(getBaseContext(), "LogIn Success---/n Welcome"+Name, Toast.LENGTH_LONG).show();
                    Intent MainPage = new Intent(getApplicationContext(), com.login.Danesmainpage.class);
                    startActivity(MainPage);

                    finish();
                }
                else {
                    Toast.makeText(getBaseContext(), "LogIn Failed---", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });


        Back = (Button)findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainPage = new Intent(getApplicationContext(), com.login.MainActivity.class);
                startActivity(MainPage);
            }
        });

    }



}
