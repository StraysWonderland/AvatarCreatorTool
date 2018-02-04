package com.strayswonderland.avatarcreatortool.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.strayswonderland.avatarcreatortool.Adapters.ImageAdapter

import com.strayswonderland.avatarcreatortool.R

class EditAvatarFragment : Fragment() {
    /*
    *   TODO: find and bind following: Section buttons, Cancel button, Swiping to Randomize??
    */
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_edit_avatar, container, false)

        val featuresGridview = view.findViewById(R.id.gv_avatarFeatures) as GridView
        featuresGridview.adapter = ImageAdapter(activity)

        featuresGridview.setOnItemClickListener({ parent, v, position, id ->
            updateAvatarFeatures(position)
        })

        val confirmButton = view.findViewById(R.id.bt_confirmAvatar) as Button
        confirmButton.setOnClickListener {
            // TODO; save Avatar with current features in Database
            // destroy current Fragment
        }

        val headSectionButton = view.findViewById(R.id.bt_HeadFeatureSelection) as ImageButton
        val skinColorSectionButton = view.findViewById(R.id.bt_SkinColorFeatureSelection) as ImageButton
        val eyesSectionButton = view.findViewById(R.id.bt_EyesFeatureSelection) as ImageButton
        val eyeColorSectionButton = view.findViewById(R.id.bt_EyeColorFeatureSelection) as ImageButton
        val mouthSectionButton = view.findViewById(R.id.bt_MouthFeatureSelection) as ImageButton
        val hairSectionButton = view.findViewById(R.id.bt_HairFeatureSelection) as ImageButton
        val hairColorSectionButton = view.findViewById(R.id.bt_HairColorFeatureSelection) as ImageButton
        val noseSectionButton = view.findViewById(R.id.bt_NoseFeatureSelection) as ImageButton

        return view
    }

    private fun updateAvatarFeatures(position: Int) {
        // TODO: save selected feature & change displayed image
    }

}
