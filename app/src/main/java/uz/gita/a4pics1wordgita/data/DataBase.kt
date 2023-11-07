package uz.gita.a4pics1wordgita.data

import android.annotation.SuppressLint
import android.content.Context
import android.database.Cursor

class Database private constructor(context: Context?) : DbHelper(context, "4pics1word.db") {
    @get:SuppressLint("Range")
    val dictionary: ArrayList<WordGamePics>
        get() {
            val dictionaries: ArrayList<WordGamePics> = ArrayList<WordGamePics>()
            val query = "SELECT * FROM game"
            val cursor: Cursor = mDataBase.rawQuery(query, null)
            cursor.moveToFirst()
            while (!cursor.isAfterLast) {
                val game1 = cursor.getInt(cursor.getColumnIndex("game1"))
                val game2 = cursor.getInt(cursor.getColumnIndex("game2"))
                val game3 = cursor.getInt(cursor.getColumnIndex("game3"))
                val game4 = cursor.getInt(cursor.getColumnIndex("game4"))

                val dictionary = WordGamePics(game1, game2, game3, game4)
                dictionaries.add(dictionary)
                cursor.moveToNext()
            }
            return dictionaries
        }


    @get:SuppressLint("Range")
    val game2: ArrayList<WordGamePics>
        get() {
            val dictionaries: ArrayList<WordGamePics> = ArrayList<WordGamePics>()
            val query = "SELECT * FROM WORDS where game2=1"
            val cursor: Cursor = mDataBase.rawQuery(query, null)
            cursor.moveToFirst()
            while (!cursor.isAfterLast) {
                val game1 = cursor.getInt(cursor.getColumnIndex("game1"))
                val game2 = cursor.getInt(cursor.getColumnIndex("game2"))
                val game3 = cursor.getInt(cursor.getColumnIndex("game3"))
                val game4 = cursor.getInt(cursor.getColumnIndex("game4"))

                val dictionary = WordGamePics(game1, game2, game3, game4)
                dictionaries.add(dictionary)
                cursor.moveToNext()
            }
            return dictionaries
        }

    @get:SuppressLint("Range")
    val game3: ArrayList<WordGamePics>
        get() {
            val dictionaries: ArrayList<WordGamePics> = ArrayList<WordGamePics>()
            val query = "SELECT * FROM WORDS where game3=1"
            val cursor: Cursor = mDataBase.rawQuery(query, null)
            cursor.moveToFirst()
            while (!cursor.isAfterLast) {
                val game1 = cursor.getInt(cursor.getColumnIndex("game1"))
                val game2 = cursor.getInt(cursor.getColumnIndex("game2"))
                val game3 = cursor.getInt(cursor.getColumnIndex("game3"))
                val game4 = cursor.getInt(cursor.getColumnIndex("game4"))

                val dictionary = WordGamePics(game1, game2, game3, game4)
                dictionaries.add(dictionary)
                cursor.moveToNext()
            }
            return dictionaries
        }

    @get:SuppressLint("Range")
    val game4: ArrayList<WordGamePics>
        get() {
            val dictionaries: ArrayList<WordGamePics> = ArrayList<WordGamePics>()
            val query = "SELECT * FROM WORDS where game4=1"
            val cursor: Cursor = mDataBase.rawQuery(query, null)
            cursor.moveToFirst()
            while (!cursor.isAfterLast) {
                val game1 = cursor.getInt(cursor.getColumnIndex("game1"))
                val game2 = cursor.getInt(cursor.getColumnIndex("game2"))
                val game3 = cursor.getInt(cursor.getColumnIndex("game3"))
                val game4 = cursor.getInt(cursor.getColumnIndex("game4"))

                val dictionary = WordGamePics(game1, game2, game3, game4)
                dictionaries.add(dictionary)
                cursor.moveToNext()
            }
            return dictionaries
        }

    companion object {
        var database: Database? = null
            private set

        fun init(context: Context?) {
            if (database == null) {
                database = Database(context)
            }
        }
    }
}