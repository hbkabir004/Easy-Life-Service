package com.example.userinterface;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper04 extends SQLiteOpenHelper {

    private static final String dbname = "mydb";
    private static final  int version = 04;


    public  MyHelper04(Context context){super(context, dbname, null, version); }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IMARGENCY_HEALTH_CARE (_id INTEGER PRIMARY KEY AUTOINCREMENT, SPECIALITY TEXT, NAME TEXT, PHONE TEXT)";
        db.execSQL(sql);

        //insert
        InsertData("Medicine & Cardio", "Dr MD. Mizanur Rahman", "723815", db);
        InsertData("Medicine", "Dr Utpal Kumar Chandra", "729304", db);
        InsertData("Medicine & Chest", "Dr Shekh Amir Hossain", "01711224427", db);
        InsertData("Cardio", "Dr Amirul Khoshru", "722470", db);
        InsertData("Cardio", "Dr Poritosh Roy", "722470", db);
        InsertData("Gastrology", "Dr Abdul Ahad", "2830250", db);
        InsertData("Liver", "Dr Golam Masud", "720081-3", db);
        InsertData("ENT", "Dr Shekh Motiar Rahman", "720081-3", db);
        InsertData("ENT", "Dr R K Nath", "01711667997", db);
        InsertData("Eye", "Dr Jalal Ahmed", "01711299634", db);
        InsertData("Gynaecology", "Dr Rowshan Ara", "731456", db);
        InsertData("Gynaecology", "Dr Sahana Razzak", "721350", db);

        //to check...
        // Log.d("MYCODE", "onCreate is called");
    }

    private void InsertData(String speciality, String name, String phone, SQLiteDatabase database) {
        ContentValues values = new ContentValues();
        values.put("SPECIALITY", speciality);
        values.put("NAME", name);
        values.put("PHONE", phone);
        database.insert("IMARGENCY_HEALTH_CARE", null, values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

