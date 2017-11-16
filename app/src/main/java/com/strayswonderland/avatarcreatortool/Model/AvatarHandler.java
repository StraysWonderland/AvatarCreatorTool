package com.strayswonderland.avatarcreatortool.Model;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.UUID;

public class AvatarHandler {
    private static AvatarHandler sAvatarLab;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public static AvatarHandler get(Context context){
        if(sAvatarLab == null){
            sAvatarLab = new AvatarHandler(context);
        }
        return sAvatarLab;
    }

    private AvatarHandler(Context context){
        mContext = context.getApplicationContext();
        // mDatabase = new AvatarBaseHelper(mContext).getWritableDatabase();
    }

    public void addOrUpdateAvatar(Avatar _avatar) {
        //TODO
    }

    private void addAvatar(Avatar a){
        //TODO
    }

    private void updateAvatar(Avatar avatar){
        //TODO
    }

    public Avatar getAvatar(String title){
        //TODO
        return null;
    }

    public Avatar getAvatar(UUID id){
       //TODO
        return null;
    }

    public List<Avatar> getListOfAvatars(){
       //TODO
        return null;
    }

}
