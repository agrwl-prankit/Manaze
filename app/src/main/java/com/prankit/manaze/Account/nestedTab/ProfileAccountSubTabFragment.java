package com.prankit.manaze.Account.nestedTab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prankit.manaze.R;

public class ProfileAccountSubTabFragment extends Fragment {

    public ProfileAccountSubTabFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subtab_profile_account, container, false);
    }
}