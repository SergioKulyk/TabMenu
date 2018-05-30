package com.example.sergeykulyk.tabbar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.sergeykulyk.tabbar.fragments.CalendarFragment;
import com.example.sergeykulyk.tabbar.fragments.ChatFragment;
import com.example.sergeykulyk.tabbar.fragments.HomeFragment;
import com.example.sergeykulyk.tabbar.fragments.MatchFragment;
import com.example.sergeykulyk.tabbar.fragments.ProfileFragment;

public class OpenTennisPagerAdapter extends FragmentPagerAdapter {

    private final static int NUM_ITEM = 5;
    private Context context;


    public OpenTennisPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public int getCount() {
        return NUM_ITEM;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new CalendarFragment();
            case 2:
                return new MatchFragment();
            case 3:
                return new ChatFragment();
            case 4:
                return new ProfileFragment();
            default:
                return new HomeFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 1:
                return context.getString(R.string.calendar_title);
            case 2:
                return context.getString(R.string.match_title);
            case 3:
                return context.getString(R.string.calendar_title);
            case 4:
                return context.getString(R.string.profile_title);
            default:
                return context.getString(R.string.home_title);
        }
    }


}
