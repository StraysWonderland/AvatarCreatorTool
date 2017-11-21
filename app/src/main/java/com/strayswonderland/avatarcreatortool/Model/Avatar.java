package com.strayswonderland.avatarcreatortool.Model;

import java.util.UUID;

public class Avatar {

    private String Title;
    private String
            Head, SkinColor,
            Eyes, EyeColor,
            Hair, HairColor,
            Nose,
            Mouth;
    private UUID mId;

    //region Constructor
    public Avatar() {
        this(UUID.randomUUID());
    }

    public Avatar(UUID id) {
        mId = id;
    }
    //endregion

    //region GettersAndSetters
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getHead() {
        return Head;
    }

    public void setHead(String head) {
        this.Head = head;
    }

    public String getSkinColor() {
        return SkinColor;
    }

    public void setSkinColor(String skinColor) {
        this.SkinColor = skinColor;
    }

    public String getEyes() {
        return Eyes;
    }

    public void setEyes(String eyes) {
        this.Eyes = eyes;
    }

    public String getEyeColor() {
        return EyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.EyeColor = eyeColor;
    }

    public String getHair() {
        return Hair;
    }

    public void setHair(String hair) {
        this.Hair = hair;
    }

    public String getHairColor() {
        return HairColor;
    }

    public void setHairColor(String hairColor) {
        this.HairColor = hairColor;
    }

    public String getNose() {
        return Nose;
    }

    public void setNose(String nose) {
        this.Nose = nose;
    }

    public String getMouth() {
        return Mouth;
    }

    public void setMouth(String mouth) {
        this.Mouth = mouth;
    }
    //endregion
}
