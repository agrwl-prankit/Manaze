package com.prankit.manaze.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.prankit.manaze.tabFragment.ActiveTaskTabFragment;
import com.prankit.manaze.tabFragment.CompletedTaskTabFragment;
import com.prankit.manaze.tabFragment.DroppedTaskTabFragment;
import com.prankit.manaze.tabFragment.HierarchyTaskTabFragment;
import com.prankit.manaze.tabFragment.NewTaskTabFragment;

public class MyTaskAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyTaskAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NewTaskTabFragment();
            case 1:
                return new ActiveTaskTabFragment();
            case 2:
                return new CompletedTaskTabFragment();
            case 3:
                return new DroppedTaskTabFragment();
            case 4:
                return new HierarchyTaskTabFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
