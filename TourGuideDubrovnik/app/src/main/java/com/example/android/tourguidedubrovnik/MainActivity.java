package com.example.android.tourguidedubrovnik;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentAdapterMain myAdapter;
    TabLayout myTabLayout;
    ViewPager myPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CREATING AND SETTING THE ADAPTER FOR FRAGMENTS
        myAdapter = new FragmentAdapterMain(this, getSupportFragmentManager());
        myAdapter.setFragments(this);

        // CREATING AND SETTING THE VIEWPAGER WITH ADAPTER
        myPager = (ViewPager) findViewById(R.id.pager);
        myPager.setAdapter(myAdapter);

        // CREATING AND SETTING THE TABLAYOUT WITH VIEWPAGER
        myTabLayout = (TabLayout) findViewById(R.id.indicator);
        myTabLayout.setupWithViewPager(myPager);

    }
}
