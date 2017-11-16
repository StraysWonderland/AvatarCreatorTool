package com.strayswonderland.avatarcreatortool.Model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.Random;
/**
 * Comprehensive List of all features
 */
public class ResourceList {
    public static String getCurrentMode() {
        return currentMode;
    }

    public static void setCurrentMode(String currentMode) {
        ResourceList.currentMode = currentMode;
    }

    private static String currentMode;

    private static Integer[] headList = {
    };

    private static Integer[] eyeColorList = {
    };

    private static Integer[] eyesBlueList = {
    };

    private static Integer[] eyesBrownList = {
    };

    private static Integer[] eyesGreenList = {
    };

    private static Integer[] mouthList = {
    };

    private static Integer[] hairColourList = {
    };

    private static Integer[] hairBlackList = {
    };

    private static Integer[] hairBrownList = {
    };

    private static Integer[] hairBlondList = {
    };

    private static Integer[] hairOrangeList = {
    };

    public static Integer[] getCurrentList() {
        switch (currentMode) {
            case "faceshape":
                return headList;
            case "eyes_colour":
                return eyeColorList;
            case "eyes_blue":
                return eyesBlueList;
            case "eyes_brown":
                return eyesBrownList;
            case "eyes_green":
                return eyesGreenList;
            case "mouth":
                return mouthList;
            case "hair_colour":
                return hairColourList;
            case "hair_black":
                return hairBlackList;
            case "hair_brown":
                return hairBrownList;
            case "hair_blond":
                return hairBlondList;
            case "hair_orange":
                return hairOrangeList;
            default:
                return null;
        }
    }

    public static Integer getCurrentImageIdentifier(int _pos) {
        switch (currentMode) {
            case "faceshape":
                return headList[_pos];
            case "eyes":
                return eyesBlueList[_pos];
            case "mouth":
                return mouthList[_pos];
            case "hair":
                return hairBlackList[_pos];
            default:
                return null;
        }
    }

    private static void randomiseFeatureList(Integer[] _array) {
        Random _rnd = new Random();
        for (int i = _array.length - 1; i > 0; i--) {
            int index = _rnd.nextInt(i + 1);
            int a = _array[index];
            _array[index] = _array[i];
            _array[i] = a;
        }
    }

    public static void randomiseAllFeatureLists() {
        randomiseFeatureList(headList);
        randomiseFeatureList(hairBlackList);
        randomiseFeatureList(hairBrownList);
        randomiseFeatureList(hairBlondList);
        randomiseFeatureList(hairOrangeList);
        randomiseFeatureList(eyesBlueList);
        randomiseFeatureList(eyesGreenList);
        randomiseFeatureList(eyesBrownList);
        randomiseFeatureList(mouthList);
    }

    /**
     * merges all feature-images of an avatar into one Layered-Drawable
     * @param mAvatar
     * @param _context
     * @return
     */
    public static LayerDrawable mergeAvatarToDrawable(Avatar mAvatar, Context _context) {
        String _head = mAvatar.getHead();
        String _hair = mAvatar.getHair();
        String _eyes = mAvatar.getEyes();
        String _mouth = mAvatar.getMouth();

        int hairImage = _context.getResources().
                getIdentifier(_hair, "drawable", _context.getPackageName());
        int eyesImage = _context.getResources().
                getIdentifier(_eyes, "drawable", _context.getPackageName());
        int mouthImage = _context.getResources().
                getIdentifier(_mouth, "drawable", _context.getPackageName());
        int faceshapeImage = _context.getResources().
                getIdentifier(_head, "drawable", _context.getPackageName());

        Drawable[] layers = new Drawable[4];
        layers[0] = _context.getResources().getDrawable(faceshapeImage, null);
        layers[1] = _context.getResources().getDrawable(eyesImage, null);
        layers[2] = _context.getResources().getDrawable(mouthImage, null);
        layers[3] = _context.getResources().getDrawable(hairImage, null);

        LayerDrawable layerDrawable = new LayerDrawable(layers);
        return layerDrawable;
    }
}
