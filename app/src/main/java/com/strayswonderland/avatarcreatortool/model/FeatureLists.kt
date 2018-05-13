package com.strayswonderland.avatarcreatortool.model

class FeatureLists {
    private var currentMode: String = "head"
        set(value) {
            field = (when (value) {
                in Modes.modes -> value
                else -> {
                    null
                }
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
}
