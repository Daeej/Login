package com.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Danesmainpage extends AppCompatActivity {
Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danesmainpage);

        start = (Button)findViewById(R.id.GetStarted);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ProductList = new Intent(getApplicationContext(), com.login.ProductListActivity.class);
                startActivity(ProductList);
            }
        });


    }

}
