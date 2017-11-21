package com.strayswonderland.avatarcreatortool.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AvatarBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "avatarBase.db";

    public AvatarBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + AvatarDbSchema.AvatarTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                AvatarDbSchema.AvatarTable.Cols.UUID + ", " +
                AvatarDbSchema.AvatarTable.Cols.TITLE + "," +
                AvatarDbSchema.AvatarTable.Cols.HEAD + ", " +
                AvatarDbSchema.AvatarTable.Cols.EYES + ", " +
                AvatarDbSchema.AvatarTable.Cols.MOUTH + ", " +
                AvatarDbSchema.AvatarTable.Cols.HAIR + ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
