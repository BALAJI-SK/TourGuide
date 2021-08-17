package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager2 viewPager2;
FragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.view_Pager2);
        tabLayout = findViewById(R.id.tab_layout);
        FragmentManager fm = getSupportFragmentManager();
        adapter =new FragmentAdapter(fm,getLifecycle());
        viewPager2.setAdapter(adapter);
        tabLayout.addTab(tabLayout.newTab().setText("Places"));
        tabLayout.addTab(tabLayout.newTab().setText("Beach"));
        tabLayout.addTab(tabLayout.newTab().setText("Hotels"));
        tabLayout.addTab(tabLayout.newTab().setText("Adventure"));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {


            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}