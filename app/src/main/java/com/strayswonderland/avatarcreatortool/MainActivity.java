package com.strayswonderland.avatarcreatortool;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.strayswonderland.avatarcreatortool.Fragments.AvatarListingFragment;
import com.strayswonderland.avatarcreatortool.Fragments.AvatarViewFragment;
import com.strayswonderland.avatarcreatortool.Fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    changeFragment(item.getItemId());
                    return true;
                case R.id.navigation_dashboard:
                    changeFragment(item.getItemId());
                    return true;
                case R.id.navigation_notifications:
                    changeFragment(item.getItemId());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.content_fragment);

        if (fragment == null) {
            fragment = new AvatarViewFragment();
            fm.beginTransaction()
                    .add(R.id.content_fragment, fragment)
                    .commit();
        }
    }

    private void changeFragment(int p_Id) {
        Fragment newFragment = null;

        switch (p_Id) {
            case R.id.navigation_home:
                newFragment = new AvatarViewFragment();
                break;
            case R.id.navigation_dashboard:
                newFragment = new AvatarListingFragment();
                break;
            case R.id.navigation_notifications:
                newFragment = new SettingsFragment();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(
                R.id.content_fragment, newFragment)
                .commit();
    }


}
