package com.strayswonderland.avatarcreatortool.Fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.strayswonderland.avatarcreatortool.R;

public class AvatarListingFragment extends Fragment {
    public AvatarListingFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_avatar_listing, container, false);
        FloatingActionButton addNewAvatarButton =
                (FloatingActionButton) view.findViewById(R.id.fab_addNewAvatar);


        addNewAvatarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment newFragment = new EditAvatarFragment();

                getFragmentManager().beginTransaction().replace(
                        R.id.content_fragment, newFragment)
                        .commit();
            }
        });

        return view;
    }


}
