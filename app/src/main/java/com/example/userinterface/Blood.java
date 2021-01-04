package com.example.userinterface;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Blood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);


        MyHelper03 helper = new MyHelper03(this);
        SQLiteDatabase database = helper.getReadableDatabase();

        Cursor cursor = database.rawQuery("SELECT NAME, TYPE, LAST_DONATION, PHONE FROM BLOOD_BANK", new String[]{});

        if(cursor != null){
            cursor.moveToFirst();
        }

        StringBuilder builder = new StringBuilder();

        do {
            String name = cursor.getString(0);
            String type = cursor.getString(1);
            String lstdn = cursor.getString(2);
            String phone = cursor.getString(3);
            builder.append("\nNAME - " + name + "\tTYPE - " + type + "\tLAST_DONATION - "+ lstdn + "\tPHONE - " + phone);

        }while (cursor.moveToNext());

        TextView textView = findViewById(R.id.txtData4);
        textView.setText(builder.toString());



    }
}
