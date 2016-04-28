package com.login;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ProductListActivity extends AppCompatActivity {
 Button Add;
    Button Display;
    DatabaseProduct db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        Add = (Button)findViewById(R.id.Addproduct);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ProductFormEntry = new Intent(getBaseContext(), com.login.ProductActivity.class);
                startActivity(ProductFormEntry);
            }
        });

        Display = (Button)findViewById(R.id.Listproduct);
        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent ItemView = new Intent(getBaseContext(), com.login.DisplayProduct.class);
            startActivity(ItemView);

            }
        });

    }

}
