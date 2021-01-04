package com.example.userinterface;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        MyHelper02 helper = new MyHelper02(this);
        SQLiteDatabase database = helper.getReadableDatabase();


        Cursor cursor = database.rawQuery("SELECT PLACE, ADDRESS, PHONE FROM FOOD_HUNT", new String[]{});

        if(cursor != null){
            cursor.moveToFirst();
        }

        StringBuilder builder = new StringBuilder();

        do {
            String place = cursor.getString(0);
            String address = cursor.getString(1);
            String phone = cursor.getString(2);
            builder.append("\nPLACE - " + place + "\tADDRESS - " + address + "\tPHONE - " + phone);

        }while (cursor.moveToNext());

        TextView textView = findViewById(R.id.txtData2);
        textView.setText(builder.toString());
    }
}
