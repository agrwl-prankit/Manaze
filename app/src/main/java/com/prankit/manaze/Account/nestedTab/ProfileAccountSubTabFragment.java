package com.prankit.manaze.Account.nestedTab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prankit.manaze.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileAccountSubTabFragment extends Fragment {

    private CircleImageView userProfileImageView;
    private TextView changePhotoTextView;
    private TextView employeeCodeTextView;
    private TextView employeeNameTextView;
    private TextView emailTextView;
    private TextView mobileNoTextView;
    private TextView reportingToNameTextView;
    private TextView reportingToEmailTextView;
    private TextView peopleManagerNameTextView;
    private TextView peopleManagerEmailTextView;

    public ProfileAccountSubTabFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_subtab_profile_account, container, false);
        initialize(view);
        return view;
    }

    private void initialize(View view) {
        userProfileImageView = view.findViewById(R.id.userProfileImageView);
        changePhotoTextView = view.findViewById(R.id.changePhotoTextView);
        employeeCodeTextView = view.findViewById(R.id.employeeCodeTextView);
        employeeNameTextView = view.findViewById(R.id.employeeNameTextView);
        emailTextView = view.findViewById(R.id.emailTextView);
        mobileNoTextView = view.findViewById(R.id.mobileNoTextView);
        reportingToNameTextView = view.findViewById(R.id.reportingToNameTextView);
        reportingToEmailTextView = view.findViewById(R.id.reportingToEmailTextView);
        peopleManagerNameTextView = view.findViewById(R.id.peopleManagerNameTextView);
        peopleManagerEmailTextView = view.findViewById(R.id.peopleManagerEmailTextView);
    }

    @Override
    public void onStart() {
        super.onStart();
        // get data from database and set here
    }
}