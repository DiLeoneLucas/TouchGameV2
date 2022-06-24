package com.example.touchgamev2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public class GameDAO {

    public static void inserir(Context context, GameActivity nome){
        Banco conn = new Banco(context);
        SQLiteDatabase db = conn.getWritableDatabase();

        db.execSQL("INSERT INTO ranking (nome) VALUES (  '" + nome + "'  ) " ) ;
        db.close();
    }
    public static List<GameActivity> getGame(Context context){
        Banco conn = new Banco(context);
        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery( "SELECT id, nome FROM ranking ORDER BY nome", null );

        List<GameActivity> lista = new ArrayList<>();

        if( cursor.getCount() > 0 ){
            cursor.moveToFirst();

            do{
                GameActivity g = new GameActivity();
                g.setPonto(  cursor.getInt( 0 ) );
                g.setNome(  cursor.getString( 1 ) );
                lista.add( g );
            }while (cursor.moveToNext());
        }
        return lista;
    }

}
