package com.example.touchgamev2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {

    private static final int PONTO = 2;
    private static final String NOME = "TouchGame";

    public Banco(Context context) {
        super(context, NOME, null, PONTO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL( "CREATE TABLE IF NOT EXISTS ranking ( " +
                " id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT , " +
                " ponto int NOT NULL," +
                " nome text ); "
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int antiga, int atual) {
        if( atual == 2 ){
            sqLiteDatabase.execSQL("DELETE FROM ranking");
        }
    }
}
