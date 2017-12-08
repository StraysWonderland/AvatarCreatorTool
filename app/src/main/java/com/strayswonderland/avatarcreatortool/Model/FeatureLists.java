package com.strayswonderland.avatarcreatortool.Model;

/**
 * Created by cagri on 08.12.2017.
 */

public class FeatureLists {
    private static String currentMode;

    public static String getCurrentMode() {
        return currentMode;
    }

    public static void setCurrentMode(String value) {
        currentMode = value;
    }

    private static Integer[] HeadFeaturesList = {};

    private static Integer[] HairFeaturesList = {};

    private static Integer[] EyesFeaturesList = {};

    private static Integer[] NoseFeaturesList = {};

    private static Integer[] MouthFeaturesList = {};
}
