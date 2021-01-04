package com.example.userinterface;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper05 extends SQLiteOpenHelper {

    private static final String dbname = "mydb1";
    private static final int version = 5;

    public MyHelper05(Context context) { super(context, dbname, null, version); }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE BOOK_DEPT_REFERENCE (_id INTEGER PRIMARY KEY AUTOINCREMENT, BOOK TEXT, WRITER TEXT, EDITION TEXT)";
        db.execSQL(sql);

        InsertData("PROGARAMMING IN ANCI C LANGUAGE", "E BALAGURUSWAMY", "4", db);
        InsertData("OBJECT ORIENTED PROGARAMMING WITH C++", "E BALAGURUSWAMY", "5", db);
        InsertData("PROGARAMMING WITH C", "BAYRON GOTTFRED", "2", db);
        InsertData("THE COMPLETE REFERENCE - C++", "HERBERT SCHILDT", "4", db);
        InsertData("SAM TEACH YOURSELF C IN 21 DAYS", "BRADLEY L JONSE and PETER AITKEN", "6", db);
        InsertData("SAM TEACH YOURSELF C++ IN 21 DAYS", "BRADLEY L JONSE and JESS LIBERTY", "5", db);
        InsertData("JAVA - THE COMPLETE REFERENCE", "HERBERT SCHILDT", "7", db);
        InsertData("DIGITAL LOGIC AND COMPUTER DESIGN", "M MORRIS MANO", "any edition will do", db);
        InsertData("FUNDAMENTALS OF COMPUTER ALGORITHMS", "ELLIS HOROWITZ and SARTAJ SAHIMI", "any edition will do", db);
        InsertData("DISCRETE MATHEMATICS", "SEYMOUR LIPSCHUTZ and MARC LIPSON", "any edition available", db);
        InsertData("LEARNING ANDROID STUDIO", "ADAM GERBER", "first edition", db);
    }

    private void InsertData(String name, String writer, String edition, SQLiteDatabase database) {
        ContentValues values = new ContentValues();
        values.put("NAME", name);
        values.put("WRITER", writer);
        values.put("EDITION", edition);
        database.insert("BOOK_DEPT_REFERENCE", null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
