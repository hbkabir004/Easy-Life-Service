package com.example.userinterface;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper02 extends SQLiteOpenHelper {

    private static final String dbname = "mydb2";
    private static final int version = 2;

    public MyHelper02(Context context) {
        super(context, dbname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE FOOD_HUNT (_id INTEGER PRIMARY KEY AUTOINCREMENT, PLACE TEXT, ADDRESS TEXT, PHONE TEXT)";
        db.execSQL(sql);
        InsertData("Hotel Kasturi", "Khulna - Jessore - Dhaka Hwy, Khulna", "723757", db);
        InsertData("Bristo - C", "Second floor, Hotel Castle Salam", "01746 - 089875", db);
        InsertData("Deshi Kitchen", "12 KDA Avenue, Khulna 9100", "01703 - 152082", db);
        InsertData("Kaifeng Chinese Restaurant", "132 Upper Jessore Road, Khulna", "01711 - 326767", db);
        InsertData("Kacchi Ghor", "KDA Avenue, Khulna", "01876 - 033311", db);
        InsertData("Tiger Garden International Hotel", "Shib Bari More Circle, 01 KDA Ave, Khulna 9100", "2830285", db);
        InsertData("The Hotel Millennium Ltd","B#4 Majid Sarani, Khulna 9100",  "041-733091", db);
        InsertData("City Inn Ltd", "B, 1 Majid Sarani, Khulna 9100", "2830467", db);
        InsertData("Hotel Castle Salam", "G-8 Taltola Lane, KDA Avenue, Khulna 9000", "041 - 720160", db);
        InsertData("Hotel Royal International", "A-33, KDA Avenue Khan Jahan Ali Road, Royal Mor Khulna 9100 BD, Khan Jahan Ali Rd, Khulna", "01718 - 679900", db);
    }

    private void InsertData(String place, String address, String phone, SQLiteDatabase database) {
        ContentValues values = new ContentValues();
        values.put("PLACE", place);
        values.put("ADDRESS", address);
        values.put("PHONE", phone);
        database.insert("FOOD_HUNT", null, values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
