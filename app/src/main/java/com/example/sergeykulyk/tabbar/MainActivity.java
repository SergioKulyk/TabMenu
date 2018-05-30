package com.example.sergeykulyk.tabbar;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.pager);

        // Create an adapter that knows what fragment should be shown on each page
        OpenTennisPagerAdapter categoryFragmentPagerAdapter = new OpenTennisPagerAdapter(getSupportFragmentManager(), MainActivity.this);

        // Set the adapter onto view pager
        viewPager.setAdapter(categoryFragmentPagerAdapter);

        // Give the TabLayout the ViewPager
        mTabLayout = findViewById(R.id.tab_layout);

        final View touchView = findViewById(R.id.pager);
        touchView.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        mTabLayout.setupWithViewPager(viewPager);
        setIconForTabLayout();
    }

    private void setIconForTabLayout() {
        Objects.requireNonNull(mTabLayout.getTabAt(0)).setIcon(R.drawable.ic_home);
        Objects.requireNonNull(mTabLayout.getTabAt(1)).setIcon(R.drawable.ic_calendar);
        Objects.requireNonNull(mTabLayout.getTabAt(2)).setIcon(R.drawable.ic_match);
        Objects.requireNonNull(mTabLayout.getTabAt(3)).setIcon(R.drawable.ic_chat);
        Objects.requireNonNull(mTabLayout.getTabAt(4)).setIcon(R.drawable.ic_profile);
    }

}
