package com.example.userinterface;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        MyHelper05 helper = new MyHelper05(this);
        SQLiteDatabase database = helper.getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT NAME, WRITER, EDITION FROM BOOK_DEPT_REFERENCE", new String[]{});

        if(cursor != null){
            cursor.moveToFirst();
        }

        StringBuilder builder = new StringBuilder();

        do {
            String name = cursor.getString(0);
            String writer = cursor.getString(1);
            String edition = cursor.getString(2);
            builder.append("NAME - " + name + "WRITER - " + writer + "EDITION - \n " + edition);

        }while (cursor.moveToNext());

        TextView textView = findViewById(R.id.txtData1);
        textView.setText(builder.toString());

    }
}
