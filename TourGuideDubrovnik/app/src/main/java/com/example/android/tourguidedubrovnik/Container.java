package com.example.android.tourguidedubrovnik;

import android.media.Image;
import android.media.Rating;
import android.view.View;
import android.widget.RatingBar;

/**
 * Created by gobov on 4/22/2017.
 */

public class Container {

    private String mItemName;

    private String mItemText;

    private String mPhoneNumber;

    private Float mRating;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mMainImageResource = NO_IMAGE_PROVIDED;

    private View.OnClickListener mTelListener, mLocListener;


    public Container (String itemName, String itemText, int mainImageId, View.OnClickListener telListener, View.OnClickListener locListener, String phoneNumber, Float rating){

        mItemName = itemName;

        mItemText = itemText;

        mMainImageResource = mainImageId;

        mTelListener = telListener;

        mLocListener = locListener;

        mPhoneNumber = phoneNumber;

        mRating = rating;

    }

    public String getItemName(){
        return mItemName;
    }

    public String getItemText(){
        return mItemText;
    }

    public String getmPhoneNumber(){return mPhoneNumber;}

    public Float getmRating(){return mRating;}

    public int getMainImageResource(){
        return mMainImageResource;
    }

    public boolean hasMainImage(){
        return mMainImageResource != NO_IMAGE_PROVIDED;
    }

    public View.OnClickListener getmTelListener(){
        return mTelListener;
    }

    public View.OnClickListener getmLocListener(){
        return mLocListener;
    }


}
