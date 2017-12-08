package com.strayswonderland.avatarcreatortool.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.strayswonderland.avatarcreatortool.R;

public class AvatarViewFragment extends Fragment {
    ImageView avatarPreview;

    public AvatarViewFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_avatar_view, container, false);

        avatarPreview = (ImageView) view.findViewById(R.id.iv_avatarView);

        // Inflate the layout for this fragment
        return view;
    }

}
