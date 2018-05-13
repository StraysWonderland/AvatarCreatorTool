package com.strayswonderland.avatarcreatortool.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridView
import android.widget.ImageButton
import com.strayswonderland.avatarcreatortool.adapters.ImageAdapter
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

        //region Button OnClick Methods
        //TODO change displayed image resources
        val headSectionButton = view.findViewById(R.id.bt_HeadFeatureSelection) as ImageButton
        headSectionButton.setOnClickListener {

        }
        val skinColorSectionButton = view.findViewById(R.id.bt_SkinColorFeatureSelection) as ImageButton
        skinColorSectionButton.setOnClickListener {

        }
        val eyesSectionButton = view.findViewById(R.id.bt_EyesFeatureSelection) as ImageButton
        eyesSectionButton.setOnClickListener {

        }
        val eyeColorSectionButton = view.findViewById(R.id.bt_EyeColorFeatureSelection) as ImageButton
        eyeColorSectionButton.setOnClickListener {

        }
        val mouthSectionButton = view.findViewById(R.id.bt_MouthFeatureSelection) as ImageButton
        mouthSectionButton.setOnClickListener({

        })
        val hairSectionButton = view.findViewById(R.id.bt_HairFeatureSelection) as ImageButton
        hairSectionButton.setOnClickListener {

        }
        val hairColorSectionButton = view.findViewById(R.id.bt_HairColorFeatureSelection) as ImageButton
        hairColorSectionButton.setOnClickListener {

        }
        val noseSectionButton = view.findViewById(R.id.bt_NoseFeatureSelection) as ImageButton
        noseSectionButton.setOnClickListener {

        }
        //endregion

        return view
    }

    private fun updateAvatarFeatures(position: Int) {
        // TODO: save selected feature & change displayed image
    }

}
