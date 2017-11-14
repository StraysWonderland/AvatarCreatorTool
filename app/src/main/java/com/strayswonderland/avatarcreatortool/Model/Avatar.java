package com.strayswonderland.avatarcreatortool.Model;

import java.util.UUID;

public class Avatar {

    private String mName;
    private String
            mHead, mSkinColor,
            mEyes, mEyeColor,
            mHair, mHairColor,
            mNose,
            mMouth;
    private UUID mId;

    //region Constructor
    public Avatar() {
        this(UUID.randomUUID());
    }

    public Avatar(UUID id) {
        mId = id;
    }

    //region GettersAndSetters
    public UUID getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmHead() {
        return mHead;
    }

    public void setmHead(String mHead) {
        this.mHead = mHead;
    }

    public String getmSkinColor() {
        return mSkinColor;
    }

    public void setmSkinColor(String mSkinColor) {
        this.mSkinColor = mSkinColor;
    }

    public String getmEyes() {
        return mEyes;
    }

    public void setmEyes(String mEyes) {
        this.mEyes = mEyes;
    }

    public String getmEyeColor() {
        return mEyeColor;
    }

    public void setmEyeColor(String mEyeColor) {
        this.mEyeColor = mEyeColor;
    }

    public String getmHair() {
        return mHair;
    }

    public void setmHair(String mHair) {
        this.mHair = mHair;
    }

    public String getmHairColor() {
        return mHairColor;
    }

    public void setmHairColor(String mHairColor) {
        this.mHairColor = mHairColor;
    }

    public String getmNose() {
        return mNose;
    }

    public void setmNose(String mNose) {
        this.mNose = mNose;
    }
    //endregion

    public String getmMouth() {
        return mMouth;
    }

    public void setmMouth(String mMouth) {
        this.mMouth = mMouth;
    }
    //endregion
}
