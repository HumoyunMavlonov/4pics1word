//package uz.gita.a4pics1wordgita.data;
//
//
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.database.Cursor;
//
//import androidx.annotation.Nullable;
//
//import java.util.ArrayList;
//
//public class MainDataBase extends DbHelper {
//    private static MainDataBase database;
//
//    public MainDataBase(@Nullable Context context) {
//        super(context, "4pics1word.db");
//    }
//
//    public static void init(Context context) {
//        if (database == null) {
//            database = new MainDataBase(context);
//        }
//    }
//
//    public static MainDataBase getDatabase() {
//        return database;
//    }
//    @SuppressLint("Range")
//    public ArrayList<WordGamePics>getDictionary() {
//        ArrayList<WordGamePics> dictionaries = new ArrayList<>();
//        String query = "SELECT * FROM WORDS";
//        Cursor cursor = mDataBase.rawQuery(query, null);
//        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//
//            int game1 = cursor.getInt(cursor.getColumnIndex("game1"));
//            int game2 = cursor.getInt(cursor.getColumnIndex("game2"));
//            int game3 = cursor.getInt(cursor.getColumnIndex("game3"));
//            int game4 = cursor.getInt(cursor.getColumnIndex("game4"));
//            WordGamePics dictionary = new WordGamePics(game1, game2, game3, game4);
//            dictionaries.add(dictionary);
//            cursor.moveToNext();
//        }
//
//        return dictionaries;
//    }
//
//    @SuppressLint("Range")
//
//    public ArrayList<WordGamePics> getGame2() {
//        ArrayList<WordGamePics> dictionaries = new ArrayList<>();
//        String query = "SELECT * FROM WORDS where game2=1";
//        Cursor cursor = mDataBase.rawQuery(query, null);
//        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//            int game1 = cursor.getInt(cursor.getColumnIndex("game1"));
//            int game2 = cursor.getInt(cursor.getColumnIndex("game2"));
//            int game3 = cursor.getInt(cursor.getColumnIndex("game3"));
//            int game4 = cursor.getInt(cursor.getColumnIndex("game4"));
//            WordGamePics dictionary = new WordGamePics(game1, game2, game3, game4);
//            dictionaries.add(dictionary);
//            cursor.moveToNext();
//        }
//        return dictionaries;
//    }
//}
