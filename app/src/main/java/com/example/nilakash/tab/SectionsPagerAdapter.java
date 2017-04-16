package com.example.nilakash.tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by NiL AkAsH on 11/2/2016.
 */

class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position){
            case 0:
                return new Request_Tab();
            case 1:
                return new Message_Tab();
            case 2:
                return new Notification_Tab();
        }

        return null;

        //return MainActivity.PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Request";
            case 1:
                return "Message";
            case 2:
                return "Notification";
        }
        return null;
    }
}