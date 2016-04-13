package com.login;

/**
 * Created by aaldaeej on 4/6/2016.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseOperation extends SQLiteOpenHelper{

    public  static final int database_version = 1;
    public String CREATE_QUERY = "CREATE TABLE "+ TableData.TableInfo.TABLE_NAME+"("+ TableData.TableInfo.USER_NAME+" TEXT,"+TableData.TableInfo.USER_PASS+" TEXT );";

    public DatabaseOperation (Context context){
        super(context, TableData.TableInfo.DATABASE_NAME, null, database_version);
        Log.d("Database Operation", "Database has been created");

    }


    @Override
    public void onCreate(SQLiteDatabase sdb) {
        sdb.execSQL(CREATE_QUERY);
        Log.d("Database Operation", "The Table has been created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        // TODO Auto-generated method stub
    }
    public void insertInformation(DatabaseOperation db, String name, String pass){

        SQLiteDatabase SQ = db.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(TableData.TableInfo.USER_NAME, name);
        cv.put(TableData.TableInfo.USER_PASS, pass);
        long k = SQ.insert(TableData.TableInfo.TABLE_NAME, null, cv);
        Log.d("Database Operation", "One row has been inserted");
    }

    public Cursor getInformation (DatabaseOperation db){
        SQLiteDatabase SQ = db.getReadableDatabase();
        String[] coloumn = {TableData.TableInfo.USER_NAME, TableData.TableInfo.USER_PASS};
        Cursor Cr = SQ.query(TableData.TableInfo.TABLE_NAME, coloumn,null, null, null, null, null);
        return  Cr;

    }
}
