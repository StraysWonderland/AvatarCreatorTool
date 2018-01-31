package com.strayswonderland.avatarcreatortool.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.strayswonderland.avatarcreatortool.R

class EditAvatarFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_edit_avatar, container, false)

        /*
        *   TODO: find and bind following:
        *   Section buttons
        *   Confirm Button
        *   Cancel button
        *   Swiping to Randomize??
         */

        val confirmButton = view.findViewById(R.id.bt_confirmAvatar) as Button

        return view
    }

}
