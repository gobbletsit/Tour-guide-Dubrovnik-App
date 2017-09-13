package com.example.android.tourguidedubrovnik;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gobov on 4/22/2017.
 */

public class FragmentAdapterMain extends FragmentPagerAdapter {

    private Context myContext;

    private MainFragmentActivity frag1, frag2, frag3, frag4;

    public FragmentAdapterMain (Context context, FragmentManager fm){
        super(fm);
        myContext = context;
    }

    public void setFragments (Context c){

        frag1 = new MainFragmentActivity();
        frag2 = new MainFragmentActivity();
        frag3 = new MainFragmentActivity();
        frag4 = new MainFragmentActivity();

        // TO SET THE SPECIFIC DATA (ITEMS) FOR EACH FRAGMENT
        frag1.setItems(c,1);
        frag2.setItems(c,2);
        frag3.setItems(c,3);
        frag4.setItems(c,4);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        if (position == 0){
            frag = frag1;
        } else if (position == 1){
            frag = frag2;
        } else if (position == 2){
            frag = frag3;
        } else {
            frag = frag4;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return myContext.getString(R.string.bars_frag);
        } else if (position == 1){
            return myContext.getString(R.string.food_wine_frag);
        } else if (position == 2){
            return myContext.getString(R.string.activities_frag);
        } else {
            return myContext.getString(R.string.attractions_frag);
        }
    }
}
