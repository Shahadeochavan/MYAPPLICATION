package com.nextech.myschool;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.nextech.myschool.SQLite.UserListMyschool;


public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HomePage home = new HomePage();
                return home;
            case 1:
                UserList userIcon = new UserList();
                return userIcon;
            case 2:
                Map locationIcon = new Map();
                return locationIcon;
            case 3:
                UserListMyschool userListMyschool=new UserListMyschool();
                return userListMyschool;
            default:
                return null;
        }
    }


    @Override
    public int getCount()    {
        return mNumOfTabs;
    }
}