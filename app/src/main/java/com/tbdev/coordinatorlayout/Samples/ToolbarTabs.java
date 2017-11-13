package com.tbdev.coordinatorlayout.Samples;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.tbdev.coordinatorlayout.Fragments.DemoFragment;
import com.tbdev.coordinatorlayout.R;
import com.tbdev.coordinatorlayout.ViewPagerAdapter;

/**
 * Created by developer on 13.11.2017.
 */

public class ToolbarTabs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_tabs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        ViewPagerAdapter mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Tab 1");
        mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Tab 2");
        mViewPagerAdapter.addFragment(DemoFragment.newInstance(), "Tab 3");
        mViewPager.setAdapter(mViewPagerAdapter);

        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
