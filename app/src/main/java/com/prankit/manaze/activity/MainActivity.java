package com.prankit.manaze.activity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.prankit.manaze.R;
import com.prankit.manaze.fragment.AccountFragment;
import com.prankit.manaze.fragment.AttendanceFragment;
import com.prankit.manaze.fragment.FeedbackFragment;
import com.prankit.manaze.fragment.MyTaskFragment;
import com.prankit.manaze.fragment.ProgressFragment;
import com.prankit.manaze.fragment.ProjectFragment;
import com.prankit.manaze.fragment.SalaryFragment;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.mainFrameLayout, new MyTaskFragment()).commit();
        toolbar.setTitle("Manaze -> My Task");
        navigationView = findViewById(R.id.navView);
        drawerLayout = findViewById(R.id.drawer);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {
            Fragment fragment = null;
            if (item.getItemId() == R.id.nav_myTask) fragment = new MyTaskFragment();
            else if (item.getItemId() == R.id.nav_projects) fragment = new ProjectFragment();
            else if (item.getItemId() == R.id.nav_progress) fragment = new ProgressFragment();
            else if (item.getItemId() == R.id.nav_salary) fragment = new SalaryFragment();
            else if (item.getItemId() == R.id.nav_attendance) fragment = new AttendanceFragment();
            else if (item.getItemId() == R.id.nav_feedback) fragment = new FeedbackFragment();
            else if (item.getItemId() == R.id.nav_account) fragment = new AccountFragment();
            fragmentManager.beginTransaction().replace(R.id.mainFrameLayout, fragment).commit();
            toolbar.setTitle("Manaze -> " + item.getTitle());
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }
}