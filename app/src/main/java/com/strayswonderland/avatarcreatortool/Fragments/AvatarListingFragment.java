package com.strayswonderland.avatarcreatortool.Fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.strayswonderland.avatarcreatortool.Model.Avatar;
import com.strayswonderland.avatarcreatortool.Model.AvatarHandler;
import com.strayswonderland.avatarcreatortool.R;

import java.util.List;

public class AvatarListingFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

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

        mRecyclerView = (RecyclerView) view.findViewById(R.id.lv_avatars);

        // use a linear layout manager
        mLayoutManager = new GridLayoutManager(getActivity().getApplicationContext(), 2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // TODO: change to actual List of Avatars
        mAdapter = new AvatarAdapter(AvatarHandler.Instance(getActivity()).getDummyAvatars());
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    private class AvatarHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        private Avatar mAvatar;

        private TextView mTitleTextView;

        public AvatarHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.avatar_list_item, parent, false));
            itemView.setOnClickListener(this);

            mTitleTextView = (TextView) itemView.findViewById(R.id.tv_avatar_item_title);
        }

        public void bind(Avatar avatar) {
            mAvatar = avatar;
            mTitleTextView.setText(mAvatar.getTitle());
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(getActivity(),
                    mAvatar.getTitle() + " clicked!", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    private class AvatarAdapter extends RecyclerView.Adapter<AvatarHolder> {

        private List<Avatar> mAvatars;

        public AvatarAdapter(List<Avatar> avatars) {
            mAvatars = avatars;
        }

        @Override
        public AvatarHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity().getApplicationContext());
            return new AvatarHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(AvatarHolder holder, int position) {
            Avatar avatar = mAvatars.get(position);
            holder.bind(avatar);
        }

        @Override
        public int getItemCount() {
            return mAvatars.size();
        }
    }

}
