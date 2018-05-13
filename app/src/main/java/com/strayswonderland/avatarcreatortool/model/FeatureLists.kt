package com.strayswonderland.avatarcreatortool.model

class FeatureLists {
    private var currentMode: String = "head"
        set(value) {
            field = (when (value) {
                in Modes.modes -> value
                else -> null
            }).toString()
        }
    private var currentSkinColour: String = "light"
    private var currentEyeColour: String = "brown"
    private var currentHairColour: String = "brown"

    val currentFeatureList: Array<Int>
        get() {
            return when (currentMode) {
                "head" -> headFeaturesList
                "skinColour" -> skinColoursList
                "hair" -> hairFeaturesList
                "hairColour" -> hairColoursList
                "eyes" -> eyesFeaturesList
                "eyeColour" -> eyeColoursList
                "nose" -> noseFeaturesList
                "mouth" -> mouthFeaturesList
            // by default return heads
                else -> headFeaturesList
            }
        }

    private val headFeaturesList: Array<Int> = arrayOf(

    )

    private val skinColoursList: Array<Int> = arrayOf(

    )

    private val hairFeaturesList: Array<Int> = arrayOf(

    )

    private val hairColoursList: Array<Int> = arrayOf(

    )

    private val eyesFeaturesList: Array<Int> = arrayOf(

    )

    private val eyeColoursList: Array<Int> = arrayOf(

    )

    private val noseFeaturesList: Array<Int> = arrayOf(

    )

    private val mouthFeaturesList: Array<Int> = arrayOf(

    )

    fun getCurrentImageIdentifier(_pos: Int): Int? {
        // TODO: adjust the filter function to filter for names containing the colour
        return when (currentMode) {
            "head" -> when (currentSkinColour) {
                "light" -> headFeaturesList.filter { it == it }[_pos]
                "dark" -> headFeaturesList.filter { it == it }[_pos]
                else -> null
            }
            "hair" -> when (currentHairColour) {
                "black" -> hairFeaturesList.filter { it == it }[_pos]
                "brown" -> hairFeaturesList.filter { it == it }[_pos]
                "blond" -> hairFeaturesList.filter { it == it }[_pos]
                "gray" -> hairFeaturesList.filter { it == it }[_pos]
                else -> null
            }
            "eyes" -> when (currentEyeColour) {
                "black" -> eyesFeaturesList.filter { it == it }[_pos]
                "brown" -> eyesFeaturesList.filter { it == it }[_pos]
                "blue" -> eyesFeaturesList.filter { it == it }[_pos]
                "green" -> eyesFeaturesList.filter { it == it }[_pos]
                else -> null
            }
            "nose" -> noseFeaturesList[_pos]
            "mouth" -> mouthFeaturesList[_pos]
            else -> null
        }
    }
}
