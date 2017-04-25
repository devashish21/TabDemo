package com.example.devashish.tabdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tablayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragments(new HomeFragment(),"Home");
        viewPagerAdapter.addFragments(new TopFreeFragment(),"Top Free");
        viewPagerAdapter.addFragments(new TopPaidFragment(),"Top Paid");
        viewPagerAdapter.addFragments(new FourthFragment(),"four");
        viewPagerAdapter.addFragments(new FifthFragment(),"fifth");
        viewPager.setAdapter(viewPagerAdapter);
        tablayout.setupWithViewPager(viewPager);
    }





}
