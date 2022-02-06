package com.prankit.manaze.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.prankit.manaze.tabFragment.ActiveTaskFragment;
import com.prankit.manaze.tabFragment.CompletedTaskFragment;
import com.prankit.manaze.tabFragment.DroppedTaskFragment;
import com.prankit.manaze.tabFragment.HierarchyTaskFragment;
import com.prankit.manaze.tabFragment.NewTaskFragment;

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
                return new NewTaskFragment();
            case 1:
                return new ActiveTaskFragment();
            case 2:
                return new CompletedTaskFragment();
            case 3:
                return new DroppedTaskFragment();
            case 4:
                return new HierarchyTaskFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
