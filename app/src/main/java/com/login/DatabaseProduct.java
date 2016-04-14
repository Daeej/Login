package com.login;

/**
 * Created by aaldaeej on 4/13/2016.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseProduct extends SQLiteOpenHelper{

    public  static final int database_version = 1;
    public String CREATE_QUERY = "CREATE TABLE "+ ProductTableData.ProductTableInfo.TABLE_NAME+"("+ProductTableData.ProductTableInfo.NAME+" TEXT,"+ProductTableData.ProductTableInfo.EMAIL+" TEXT,"+ProductTableData.ProductTableInfo.PRODUCT_TYPE+" TEXT,"+ProductTableData.ProductTableInfo.DESCRIPTION+" TEXT,"+ProductTableData.ProductTableInfo.PRICE+" TEXT,"+ProductTableData.ProductTableInfo.CONTACT+" TEXT);";

    public DatabaseProduct (Context context){
        super(context, ProductTableData.ProductTableInfo.DATABASE_NAME, null, database_version);
        Log.d("Database Product", "Product Database has been created");

    }


    @Override
    public void onCreate(SQLiteDatabase sdb) {
        sdb.execSQL(CREATE_QUERY);
        Log.d("Database Product", "The Product Table has been created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        // TODO Auto-generated method stub
    }
    public void insertInformation(DatabaseProduct db, String name, String email, String producttype, String des, String price, String contact){

        SQLiteDatabase SQ = db.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(ProductTableData.ProductTableInfo.NAME, name);
        cv.put(ProductTableData.ProductTableInfo.EMAIL, email);
        cv.put(ProductTableData.ProductTableInfo.PRODUCT_TYPE, producttype);
        cv.put(ProductTableData.ProductTableInfo.DESCRIPTION, des);
        cv.put(ProductTableData.ProductTableInfo.PRICE, price);
        cv.put(ProductTableData.ProductTableInfo.CONTACT, contact);

        long k = SQ.insert(ProductTableData.ProductTableInfo.TABLE_NAME, null, cv);
        Log.d("Product Database", "One row has been inserted");
    }

    public Cursor getInformation (DatabaseProduct db){
        SQLiteDatabase SQ = db.getReadableDatabase();
        String[] coloumn = {ProductTableData.ProductTableInfo.NAME, ProductTableData.ProductTableInfo.EMAIL, ProductTableData.ProductTableInfo.PRODUCT_TYPE, ProductTableData.ProductTableInfo.DESCRIPTION,ProductTableData.ProductTableInfo.PRICE, ProductTableData.ProductTableInfo.CONTACT};
        Cursor Cr = SQ.query(TableData.TableInfo.TABLE_NAME, coloumn,null, null, null, null, null);
        return  Cr;

    }
}

