package com.prankit.manaze.Account;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.prankit.manaze.Account.tab.ConfirmationAccountTabFragment;
import com.prankit.manaze.Account.tab.EManagementAccTabFragment;
import com.prankit.manaze.Account.tab.PManagementAccTabFragment;
import com.prankit.manaze.Account.tab.SelfAccountTabFragment;

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
