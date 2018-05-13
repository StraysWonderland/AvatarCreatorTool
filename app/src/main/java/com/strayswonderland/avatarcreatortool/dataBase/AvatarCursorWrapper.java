package com.strayswonderland.avatarcreatortool.dataBase;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.strayswonderland.avatarcreatortool.dataBase.AvatarDbSchema.AvatarTable;
import com.strayswonderland.avatarcreatortool.model.Avatar;

import java.util.UUID;

public class AvatarCursorWrapper extends CursorWrapper {
    public AvatarCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Avatar getAvatar() {
        String uuidString = getString(getColumnIndex(AvatarTable.Cols.UUID));
        String titleString = getString(getColumnIndex(AvatarTable.Cols.TITLE));
        String head = getString(getColumnIndex(AvatarTable.Cols.HEAD));
        String skincolour = getString(getColumnIndex(AvatarTable.Cols.SKINCOLOUR));
        String eyes = getString(getColumnIndex(AvatarTable.Cols.EYES));
        String eyecolour = getString(getColumnIndex(AvatarTable.Cols.EYECOLOUR));
        String hair = getString(getColumnIndex(AvatarTable.Cols.HAIR));
        String haircolour = getString(getColumnIndex(AvatarTable.Cols.HAIRCOLOUR));
        String nose = getString(getColumnIndex(AvatarTable.Cols.NOSE));
        String mouth = getString(getColumnIndex(AvatarTable.Cols.MOUTH));


        Avatar avatar = new Avatar(UUID.fromString(uuidString),
                titleString,
                head,
                skincolour,
                eyes,
                eyecolour,
                hair,
                haircolour,
                nose,
                mouth
        );
        return avatar;
    }
}
