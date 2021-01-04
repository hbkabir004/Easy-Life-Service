package com.example.userinterface;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {
    private static final String dbname = "mydb3";
    private static final int version = 1;

    public MyHelper(Context context) {
        super(context, dbname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE STATIONARY_SHOP (_id INTEGER PRIMARY KEY AUTOINCREMENT, SHOP TEXT, ADDRESS TEXT, PHONE TEXT)";
        db.execSQL(sql);

        InsertData("Fair Price", "Raligate", "01957112256", db);
        InsertData("Vai Vai Papers and Stationary", "Tootpara Main road", "no number has chosen", db);
        InsertData("Save N Save", "Khulna", "812813", db);

    }

    private void InsertData(String shop, String address, String phone, SQLiteDatabase database) {
        ContentValues values = new ContentValues();
        values.put("SHOP", shop);
        values.put("ADDRESS", address);
        values.put("PHONE", phone);
        database.insert("STATIONARY_SHOP", null, values);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
