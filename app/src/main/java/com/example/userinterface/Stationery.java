package com.example.userinterface;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Stationery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stationery);

        MyHelper helper = new MyHelper(this);
        SQLiteDatabase database = helper.getReadableDatabase();


        Cursor cursor = database.rawQuery("SELECT SHOP, ADDRESS, PHONE FROM STATIONARY_SHOP", new String[]{});

        if(cursor != null){
            cursor.moveToFirst();
        }

        StringBuilder builder = new StringBuilder();

        do {
            String shop = cursor.getString(0);
            String address = cursor.getString(1);
            String phone = cursor.getString(2);
            builder.append("\nSHOP - " + shop + "\nADDRESS - " + address + "\nPHONE - \n" + phone);

        }while (cursor.moveToNext());

        TextView textView = findViewById(R.id.txtData3);
        textView.setText(builder.toString());
    }
}
