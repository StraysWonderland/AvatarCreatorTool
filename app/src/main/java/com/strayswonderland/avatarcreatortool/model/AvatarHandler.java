package com.strayswonderland.avatarcreatortool.model;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.strayswonderland.avatarcreatortool.dataBase.AvatarBaseHelper;
import com.strayswonderland.avatarcreatortool.dataBase.AvatarCursorWrapper;
import com.strayswonderland.avatarcreatortool.dataBase.AvatarDbSchema;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AvatarHandler {
    private static AvatarHandler sAvatarLab;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public static AvatarHandler Instance(Context context) {
        if (sAvatarLab == null) {
            sAvatarLab = new AvatarHandler(context);
        }
        return sAvatarLab;
    }

    private AvatarHandler(Context context) {
        mContext = context.getApplicationContext();
        mDatabase = new AvatarBaseHelper(mContext).getWritableDatabase();
    }

    public void addOrUpdateAvatar(Avatar _avatar) {
        Avatar mAvatar;
        if ((mAvatar = this.getAvatar(_avatar.getId())) != null) {
            this.updateAvatar(mAvatar);
        } else {
            this.addAvatar(_avatar);
        }
    }

    private void addAvatar(Avatar a) {
        ContentValues values = getContentValues(a);
        mDatabase.insert(AvatarDbSchema.AvatarTable.NAME, null, values);
    }

    private void updateAvatar(Avatar avatar) {
        String uuidString = avatar.getId().toString();
        ContentValues values = getContentValues(avatar);

        mDatabase.update(AvatarDbSchema.AvatarTable.NAME, values,
                AvatarDbSchema.AvatarTable.Cols.UUID + " = ?",
                new String[]{uuidString});
    }

    public Avatar getAvatar(String title) {
        try (AvatarCursorWrapper cursor = queryAvatar(
                AvatarDbSchema.AvatarTable.Cols.TITLE + " = ?",
                new String[]{title})) {
            if (cursor.getCount() == 0) {
                return null;
            }
            cursor.moveToFirst();
            return cursor.getAvatar();
        }
    }

    public Avatar getAvatar(UUID id) {
        try (AvatarCursorWrapper cursor = queryAvatar(
                AvatarDbSchema.AvatarTable.Cols.UUID + " = ?",
                new String[]{id.toString()}
        )) {
            if (cursor.getCount() == 0) {
                return null;
            }
            cursor.moveToFirst();
            return cursor.getAvatar();
        }
    }

    public List<Avatar> getDummyAvatars() {
        List<Avatar> dummyList = new ArrayList<>();

        Avatar avatar = new Avatar();
        avatar.setTitle(avatar.getId().toString());
        dummyList.add(avatar);

        avatar = new Avatar();
        avatar.setTitle(avatar.getId().toString());
        dummyList.add(avatar);

        avatar = new Avatar();
        avatar.setTitle(avatar.getId().toString());
        dummyList.add(avatar);

        avatar = new Avatar();
        avatar.setTitle(avatar.getId().toString());
        dummyList.add(avatar);

        avatar = new Avatar();
        avatar.setTitle(avatar.getId().toString());
        dummyList.add(avatar);

        return dummyList;
    }

    public List<Avatar> getAvatars() {
        List<Avatar> avatars = new ArrayList<>();
        try (AvatarCursorWrapper cursor = queryAvatar(null, null)) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                avatars.add(cursor.getAvatar());
                cursor.moveToNext();
            }
        }
        return avatars;
    }

    private static ContentValues getContentValues(Avatar avatar) {
        ContentValues values = new ContentValues();
        values.put(AvatarDbSchema.AvatarTable.Cols.UUID, avatar.getId().toString());
        values.put(AvatarDbSchema.AvatarTable.Cols.TITLE, avatar.getTitle());
        values.put(AvatarDbSchema.AvatarTable.Cols.HEAD, avatar.getHead());
        values.put(AvatarDbSchema.AvatarTable.Cols.EYES, avatar.getEyes());
        values.put(AvatarDbSchema.AvatarTable.Cols.MOUTH, avatar.getMouth());
        values.put(AvatarDbSchema.AvatarTable.Cols.HAIR, avatar.getHair());
        return values;
    }

    private AvatarCursorWrapper queryAvatar(String whereClause, String[] whereArgs) {
        Cursor cursor = mDatabase.query(
                AvatarDbSchema.AvatarTable.NAME,
                null,    //Columns - null selects all
                whereClause,
                whereArgs,
                null,    //groupBy
                null,
                null
        );
        return new AvatarCursorWrapper(cursor);
    }

}
