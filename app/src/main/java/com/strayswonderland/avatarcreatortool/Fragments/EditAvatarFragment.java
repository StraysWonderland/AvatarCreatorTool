package com.strayswonderland.avatarcreatortool.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.strayswonderland.avatarcreatortool.R;

public class EditAvatarFragment extends Fragment {
    public EditAvatarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_avatar, container, false);

        return view;
    }

}
