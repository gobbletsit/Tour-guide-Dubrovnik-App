package com.example.android.tourguidedubrovnik;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by gobov on 4/22/2017.
 */

public class ContainerAdapter extends ArrayAdapter<Container> {

    private int mColorResourceIDBackground;

    private int mColorResourceIDText;


    public ContainerAdapter(Activity context, ArrayList<Container> container, int colorResourceIdBackground, int colorResourceIdText){
        super(context, 0, container);
        mColorResourceIDBackground = colorResourceIdBackground;
        mColorResourceIDText = colorResourceIdText;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.frag_list_item, parent, false);
        }

        Container currentContainer = getItem(position);

        // GETTING THE COLOR ID FROM CONSTRUCTOR
        int colorText = ContextCompat.getColor(getContext(), mColorResourceIDText);

        // FINDING THE VIEW, SETTING THE TEXT AND COLOR ON IT
        TextView itemNameTxtView = (TextView) listItemView.findViewById(R.id.item_name);
        itemNameTxtView.setText(currentContainer.getItemName());
        itemNameTxtView.setTextColor(colorText);

        TextView itemDescrTxtView = (TextView) listItemView.findViewById(R.id.text_description);
        itemDescrTxtView.setText(currentContainer.getItemText());
        itemDescrTxtView.setTextColor(colorText);

        TextView itemTelNumber = (TextView) listItemView.findViewById(R.id.tel_text_view);
        itemTelNumber.setText(currentContainer.getmPhoneNumber());
        itemTelNumber.setTextColor(colorText);

        final TextView itemRatingText = (TextView) listItemView.findViewById(R.id.rating_txt);
        itemRatingText.setText(String.valueOf(currentContainer.getmRating()));
        itemRatingText.setTextColor(colorText);

        // FINDING THE IMAGE VIEWS AND SETTING IMAGE IDS ON IT
        ImageView mainImageView = (ImageView) listItemView.findViewById(R.id.item_image);

        ImageView telImageView = (ImageView) listItemView.findViewById(R.id.tel_icon_image);
        telImageView.setImageResource(R.drawable.smartphone);
        telImageView.setOnClickListener(currentContainer.getmTelListener());

        ImageView locImageView = (ImageView) listItemView.findViewById(R.id.location_icon);
        locImageView.setImageResource(R.drawable.map2);
        locImageView.setOnClickListener(currentContainer.getmLocListener());

        // SETTING THE BACKGROUND COLOR ON THE MAIN VIEW
        View itemContainer = listItemView.findViewById(R.id.item_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceIDBackground);
        itemContainer.setBackgroundColor(color);

        // FINDING THE RATING BAR AND SETTING LISTENER ON IT
        final RatingBar ratingB = (RatingBar)listItemView.findViewById(R.id.rating_bar);
        ratingB.setRating(currentContainer.getmRating());
        ratingB.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                itemRatingText.setText(String.valueOf(rating));
            }
        });

        // CHECKING IF THERE IS A MAIN IMAGE TO DISPLAY
        if (currentContainer.hasMainImage()){
            mainImageView.setImageResource(currentContainer.getMainImageResource());

            mainImageView.setVisibility(View.VISIBLE);
        } else {
            mainImageView.setVisibility(View.GONE);
        }



        return listItemView;

    }
}
