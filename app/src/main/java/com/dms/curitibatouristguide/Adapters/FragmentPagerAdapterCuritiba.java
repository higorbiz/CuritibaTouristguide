package com.dms.curitibatouristguide.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

import com.dms.curitibatouristguide.Fragments.NightFragment;
import com.dms.curitibatouristguide.Fragments.PointsFragment;
import com.dms.curitibatouristguide.Fragments.RestaurantFragment;
import com.dms.curitibatouristguide.Fragments.TourFragment;

public class FragmentPagerAdapterCuritiba extends FragmentPagerAdapter {


    private String tabTitles[] = new String[] { "TOURS", "POINTS", "NIGHT", "RESTAURANTS" };

    public FragmentPagerAdapterCuritiba(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0:
                return new TourFragment();
            case 1:
                return new PointsFragment();
            case 2:
                return new NightFragment();
             default:
                return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
