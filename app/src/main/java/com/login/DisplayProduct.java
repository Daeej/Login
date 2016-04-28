package com.login;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class DisplayProduct extends AppCompatActivity {

    ListView listView;
    SQLiteDatabase SQ;
    DatabaseProduct databaseProduct;
    Cursor cursor;
    ListDataAdapter listDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_product);
        listView = (ListView) findViewById(R.id.list_view);
        listDataAdapter = new ListDataAdapter(getApplicationContext(), R.layout.row_layout);
        listView.setAdapter(listDataAdapter);
        databaseProduct = new DatabaseProduct(getApplicationContext());
        SQ = databaseProduct.getReadableDatabase();
        cursor = databaseProduct.getInformation(SQ);
        if(cursor.moveToFirst()){
            do {
                String type,name,price;
                type = cursor.getString(0);
                name = cursor.getString(1);
                price = cursor.getString(2);
                DataProvider dataProvider = new DataProvider(type,name,price);
                listDataAdapter.add(dataProvider);
            }while (cursor.moveToNext());

        }

    }

}
