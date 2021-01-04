package com.example.userinterface;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper03 extends SQLiteOpenHelper {
    private static final String dbname = "mydb4";
    private static final  int version = 3;

    public  MyHelper03(Context context){super(context, dbname, null, version); }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE BLOOD_BANK (_id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, TYPE TEXT, LAST_DONATION TEXT, PHONE TEXT)";
        db.execSQL(sql);

        //insert
        InsertData("Md. Hasanul Banna Khan Abir", "O+","16.02.2019", "01984772121", db);
        InsertData("Farazi Faiaz Hasan Utsho", "O+","24.02.2019", "01303164177", db);
        InsertData("Mehedi Hssan (Ashiq)", "O+","17.11.2018", "01932974266", db);
        InsertData("Md. Mehedi Hasan", "A+","19.09.2018", "01738225069", db);
        InsertData("Sowad Karim", "AB+","3 month ago", "01738225069", db);
        InsertData("Partha Mollick", "B+","6.08.2018", "01638395356", db);
        InsertData("Md. Arifur Rahman", "B+","10.01.2019", "01935776776", db);
        InsertData("Noman Ahmed Anil", "O+","3 month ago", "01935776776", db);
        InsertData("Tazin Arfin Munia", "AB+","December, 2017", "01940279017", db);
        InsertData("Monantosh Gosh", "O+","December, 2017", "01756912757", db);
        InsertData("Tirtha Biswas", "O+","July, 2017", "01911187363", db);

    }

    private void InsertData(String name, String type, String lstdn, String phone, SQLiteDatabase database) {
        ContentValues values = new ContentValues();
        values.put("NAME", name);
        values.put("TYPE", type);
        values.put("LAST_DONATION", lstdn);
        values.put("PHONE", phone);
        database.insert("BLOOD_BANK", null, values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

