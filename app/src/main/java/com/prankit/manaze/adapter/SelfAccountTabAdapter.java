package com.prankit.manaze.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.prankit.manaze.nestedTabFragment.AccountAccSubTabFragment;
import com.prankit.manaze.nestedTabFragment.EducationAccountSubTabFragment;
import com.prankit.manaze.nestedTabFragment.EmploymentAccSubTabFragment;
import com.prankit.manaze.nestedTabFragment.NomineeAccountSubTabFragment;
import com.prankit.manaze.nestedTabFragment.PersonalAccountSubTabFragment;
import com.prankit.manaze.nestedTabFragment.ProfileAccountSubTabFragment;
import com.prankit.manaze.nestedTabFragment.StatutoryAccSubTabFragment;
import com.prankit.manaze.tabFragment.ActiveTaskTabFragment;
import com.prankit.manaze.tabFragment.CompletedTaskTabFragment;
import com.prankit.manaze.tabFragment.DroppedTaskTabFragment;
import com.prankit.manaze.tabFragment.HierarchyTaskTabFragment;
import com.prankit.manaze.tabFragment.NewTaskTabFragment;

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
