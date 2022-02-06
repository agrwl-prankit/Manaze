package com.prankit.manaze.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.prankit.manaze.tabFragment.ConfirmationAccountTabFragment;
import com.prankit.manaze.tabFragment.EManagementAccTabFragment;
import com.prankit.manaze.tabFragment.PManagementAccTabFragment;
import com.prankit.manaze.tabFragment.SelfAccountTabFragment;

public class AccountAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public AccountAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SelfAccountTabFragment();
            case 1:
                return new ConfirmationAccountTabFragment();
            case 2:
                return new PManagementAccTabFragment();
            case 3:
                return new EManagementAccTabFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
