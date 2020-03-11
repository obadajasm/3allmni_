package com.example.a3allmni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.example.a3allmni.Adapters.SectionsPageAdapter;
import com.example.a3allmni.Fragments.Tab1Fragment;
import com.example.a3allmni.Fragments.Tab2Fragment;
import com.example.a3allmni.Fragments.Tab3Fragment;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;
    private TabLayout tabLayout;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.container);
        tabLayout = findViewById(R.id.tabs);

        // Set up the ViewPager with the sections adapter.
        setupViewPager();
    }

    private void setupViewPager() {

         mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Tab1Fragment(), "a");
        mSectionsPageAdapter.addFragment(new Tab2Fragment(), "");
        mSectionsPageAdapter.addFragment(new Tab3Fragment(), "");
        mViewPager.setAdapter(mSectionsPageAdapter);
        tabLayoutIcons();
    }

    private void  tabLayoutIcons(){
        tabLayout.setupWithViewPager(mViewPager);
       tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_closed);

    }
}
