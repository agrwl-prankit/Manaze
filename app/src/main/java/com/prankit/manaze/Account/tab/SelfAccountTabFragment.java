package com.prankit.manaze.Account.tab;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.prankit.manaze.R;
import com.prankit.manaze.Account.SelfAccountTabAdapter;

public class SelfAccountTabFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public SelfAccountTabFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_self_account, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager = view.findViewById(R.id.self_accountTab_viewpager);
        tabLayout = view.findViewById(R.id.self_accountTab_tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Profile"));
        tabLayout.addTab(tabLayout.newTab().setText("Personal"));
        tabLayout.addTab(tabLayout.newTab().setText("Nominee"));
        tabLayout.addTab(tabLayout.newTab().setText("Education"));
        tabLayout.addTab(tabLayout.newTab().setText("Employment"));
        tabLayout.addTab(tabLayout.newTab().setText("Account"));
        tabLayout.addTab(tabLayout.newTab().setText("Statutory"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final SelfAccountTabAdapter adapter = new SelfAccountTabAdapter(getActivity(),getActivity().getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}