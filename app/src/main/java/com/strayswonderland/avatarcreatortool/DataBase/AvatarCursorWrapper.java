package com.strayswonderland.avatarcreatortool.DataBase;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.strayswonderland.avatarcreatortool.DataBase.AvatarDbSchema.AvatarTable;

import java.util.UUID;

public class AvatarCursorWrapper extends CursorWrapper {
    public AvatarCursorWrapper(Cursor cursor){
        super(cursor);
    }

    public Avatar getAvatar(){
        String uuidString = getString(getColumnIndex(AvatarTable.Cols.UUID));
        String titleString = getString(getColumnIndex(AvatarTable.Cols.TITLE));
        String head = getString(getColumnIndex(AvatarTable.Cols.HEAD));
        String eyes = getString(getColumnIndex(AvatarTable.Cols.EYES));
        String mouth = getString(getColumnIndex(AvatarTable.Cols.MOUTH));
        String hair = getString(getColumnIndex(AvatarTable.Cols.HAIR));

        Avatar avatar = new Avatar(UUID.fromString(uuidString));
        avatar.setTitle(titleString);
        avatar.setHead(head);
        avatar.setEyes(eyes);
        avatar.setMouth(mouth);
        avatar.setHair(hair);

        return avatar;
    }
}
