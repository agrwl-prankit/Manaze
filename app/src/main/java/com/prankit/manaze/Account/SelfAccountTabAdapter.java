package com.prankit.manaze.Account;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.prankit.manaze.Account.nestedTab.AccountAccSubTabFragment;
import com.prankit.manaze.Account.nestedTab.EducationAccountSubTabFragment;
import com.prankit.manaze.Account.nestedTab.EmploymentAccSubTabFragment;
import com.prankit.manaze.Account.nestedTab.NomineeAccountSubTabFragment;
import com.prankit.manaze.Account.nestedTab.PersonalAccountSubTabFragment;
import com.prankit.manaze.Account.nestedTab.ProfileAccountSubTabFragment;
import com.prankit.manaze.Account.nestedTab.StatutoryAccSubTabFragment;

public class SelfAccountTabAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public SelfAccountTabAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ProfileAccountSubTabFragment();
            case 1:
                return new PersonalAccountSubTabFragment();
            case 2:
                return new NomineeAccountSubTabFragment();
            case 3:
                return new EducationAccountSubTabFragment();
            case 4:
                return new EmploymentAccSubTabFragment();
            case 5:
                return new AccountAccSubTabFragment();
            case 6:
                return new StatutoryAccSubTabFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
