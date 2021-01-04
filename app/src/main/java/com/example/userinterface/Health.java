package com.example.userinterface;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        MyHelper04 helper = new MyHelper04(this);
        SQLiteDatabase database = helper.getReadableDatabase();

        //UPDATE Data
        //SQLiteDatabase database = helper.getWritableDatabase();
        //ContentValues = new ContentValues();
        //values.put("NAME", "Dr Abu Bakar");
        //values.put("PHONE", "722878");
        //database.update{"IMARGENCY_HEALTH_CARE", values, "_id =?, new String[] {"1"}};


        //DELETE Data
        //database.delete{"IMARGENCY_HEALTH_CARE", values, "_id =?, new String[] {"1"}};

        Cursor cursor = database.rawQuery("SELECT SPECIALITY, NAME, PHONE FROM IMARGENCY_HEALTH_CARE", new String[]{});

        if(cursor != null){
            cursor.moveToFirst();
        }

        StringBuilder builder = new StringBuilder();

        do {
            String speciality = cursor.getString(0);
            String name = cursor.getString(1);
            String phone = cursor.getString(2);
            builder.append("\nSPECIALITY - " + speciality + "\tNAME - " + name + "\tPHONE - " + phone);

        }while (cursor.moveToNext());

        TextView textView = findViewById(R.id.txtData);
        textView.setText(builder.toString());


    }
}

