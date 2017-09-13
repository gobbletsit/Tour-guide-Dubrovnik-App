package com.example.android.tourguidedubrovnik;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragmentActivity extends Fragment {



    // DECLARING PHONE STRINGS TO USE FOR EACH ITEM IN A LIST VIEW
    private String phoneNumber1, phoneNumber2, phoneNumber3, phoneNumber4, phoneNumber5;

    // DECLARING LOCATION STRINGS TO USE FOR EACH ITEM IN A LIST VIEW
    private String location1, location2, location3, location4, location5;

    // ARRAY LIST TO STORE EACH CONTAINER(ITEM)
    private ArrayList<Container> items;

    private Container one, two, three, four, five;

    // IDS FOR TEXT AND BACKGROUND COLOR OF EACH FRAGMENT
    private int colorBack, colorText;

    // SETTING LISTENER INTERFACE TO USE FOR PHONE AND LOCATION IMAGE VIEWS
    private View.OnClickListener telListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse(phoneNumber1));
            startActivity(callIntent);
        }
    };

    private View.OnClickListener telListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse(phoneNumber2));
            startActivity(callIntent);
        }
    };

    private View.OnClickListener telListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse(phoneNumber3));
            startActivity(callIntent);
        }
    };

    private View.OnClickListener telListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse(phoneNumber4));
            startActivity(callIntent);
        }
    };

    private View.OnClickListener telListener5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse(phoneNumber5));
            startActivity(callIntent);
        }
    };

    private View.OnClickListener locListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri geo = Uri.parse(location1);
            Intent mapLocation = new Intent(Intent.ACTION_VIEW, geo);
            mapLocation.setPackage("com.google.android.apps.maps");
            if (mapLocation.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(mapLocation);

            }
        }
    };

    private View.OnClickListener locListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri geo = Uri.parse(location2);
            Intent mapLocation = new Intent(Intent.ACTION_VIEW, geo);
            mapLocation.setPackage("com.google.android.apps.maps");
            if (mapLocation.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(mapLocation);

            }
        }
    };

    private View.OnClickListener locListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri geo = Uri.parse(location3);
            Intent mapLocation = new Intent(Intent.ACTION_VIEW, geo);
            mapLocation.setPackage("com.google.android.apps.maps");
            if (mapLocation.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(mapLocation);

            }
        }
    };

    private View.OnClickListener locListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri geo = Uri.parse(location4);
            Intent mapLocation = new Intent(Intent.ACTION_VIEW, geo);
            mapLocation.setPackage("com.google.android.apps.maps");
            if (mapLocation.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(mapLocation);

            }
        }
    };

    private View.OnClickListener locListener5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri geo = Uri.parse(location5);
            Intent mapLocation = new Intent(Intent.ACTION_VIEW, geo);
            mapLocation.setPackage("com.google.android.apps.maps");
            if (mapLocation.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(mapLocation);

            }
        }
    };


    public MainFragmentActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView1 = inflater.inflate(R.layout.fragment_main, container, false);

        setRetainInstance(true);

        items = new ArrayList<Container>();
        items.add(one);
        items.add(two);
        items.add(three);
        items.add(four);
        items.add(five);

        ContainerAdapter adapter = new ContainerAdapter(getActivity(), items, colorBack, colorText);

        // FINDING THE LIST VIEW
        ListView listView = (ListView) rootView1.findViewById(R.id.list_frag_main);

        // SETTING ADAPTER ON A LIST VIEW
        listView.setAdapter(adapter);

        return rootView1;
    }

    // SETTING THE DATA FOR EACH FRAGMENT WITH POSITION PARAMETER TO SET IN FRAGMENT ADAPTER
    public void setItems(Context mContext, int position){

        // DECLARING ITEM NAMES STRINGS
        String itemName1, itemName2, itemName3, itemName4, itemName5;

        // DECLARING TEXT DESCRIPTION STRINGS
        String description1, description2, description3, description4, description5;

        if (position == 1) {

            // INITIALIZING ITEM STRINGS TO USE FOR CUSTOM CONTAINER
            itemName1 = mContext.getString(R.string.katie);
            itemName2 = mContext.getString(R.string.art);
            itemName3 = mContext.getString(R.string.karaka);
            itemName4 = mContext.getString(R.string.cele);
            itemName5 = mContext.getString(R.string.buza);

            description1 = mContext.getString(R.string.katie_description);
            description2 = mContext.getString(R.string.art_description);
            description3 = mContext.getString(R.string.karaka_description);
            description4 = mContext.getString(R.string.cele_description);
            description5 = mContext.getString(R.string.buza_description);

            phoneNumber1 = mContext.getString(R.string.tel_katie);
            phoneNumber2 = mContext.getString(R.string.tel_art);
            phoneNumber3 = mContext.getString(R.string.tel_karaka);
            phoneNumber4 = mContext.getString(R.string.tel_cele);
            phoneNumber5 = mContext.getString(R.string.tel_buza);

            location1 = mContext.getString(R.string.loc_katie);
            location2 = mContext.getString(R.string.loc_art);
            location3 = mContext.getString(R.string.loc_karaka);
            location4 = mContext.getString(R.string.loc_cele);
            location5 = mContext.getString(R.string.loc_buza);

            // INITIALIZING CUSTOM CONTAINER
            one = new Container(itemName1, description1, R.drawable.katie, telListener1, locListener1, phoneNumber1, 3.0f);
            two = new Container(itemName2, description2, R.drawable.art, telListener2, locListener2, phoneNumber2, 4.0f);
            three = new Container(itemName3, description3, R.drawable.karaka, telListener3, locListener3, phoneNumber3, 4.0f);
            four = new Container(itemName4, description4, R.drawable.cele, telListener4, locListener4, phoneNumber4, 3.0f);
            five = new Container(itemName5, description5, R.drawable.buza, telListener5, locListener5, phoneNumber5, 3.0f);

            // INITIALIZING INT COLORS TO SET
            colorBack = R.color.colorBars;
            colorText = R.color.textColorBars;

        } else if (position == 2){

            // INITIALIZING ITEM STRINGS TO USE FOR CUSTOM CONTAINER
            itemName1 = mContext.getString(R.string.nautika);
            itemName2 = mContext.getString(R.string.orsan);
            itemName3 = mContext.getString(R.string.shizuku);
            itemName4 = mContext.getString(R.string.mea_culpa);
            itemName5 = mContext.getString(R.string.pantarul);

            description1 = mContext.getString(R.string.nautika_description);
            description2 = mContext.getString(R.string.orsan_description);
            description3 = mContext.getString(R.string.shizuku_description);
            description4 = mContext.getString(R.string.mea_culpa_description);
            description5 = mContext.getString(R.string.pantarul_description);

            phoneNumber1 = mContext.getString(R.string.tel_nautika);
            phoneNumber2 = mContext.getString(R.string.tel_orsan);
            phoneNumber3 = mContext.getString(R.string.tel_shizuku);
            phoneNumber4 = mContext.getString(R.string.tel_mea_culpa);
            phoneNumber5 = mContext.getString(R.string.tel_pantarul);

            location1 = mContext.getString(R.string.loc_nautika);
            location2 = mContext.getString(R.string.loc_orsan);
            location3 = mContext.getString(R.string.loc_shizuku);
            location4 = mContext.getString(R.string.loc_mea_culpa);
            location5 = mContext.getString(R.string.loc_pantarul);

            // INITIALIZING CUSTOM CONTAINER
            one = new Container(itemName1, description1, R.drawable.nautika, telListener1, locListener2, phoneNumber1, 4.0f);
            two = new Container(itemName2, description2, R.drawable.orsan, telListener2, locListener2, phoneNumber2, 4.0f);
            three = new Container(itemName3, description3, R.drawable.shizuku, telListener3, locListener3, phoneNumber3, 3.0f);
            four = new Container(itemName4, description4, R.drawable.mea_culpa, telListener4, locListener4, phoneNumber4, 4.0f);
            five = new Container(itemName5, description5, R.drawable.pantarul, telListener5, locListener5, phoneNumber5, 5.0f);

            // INITIALIZING INT COLORS TO SET
            colorBack = R.color.colorRestaurants;
            colorText = R.color.textColorRestaurants;

        } else if (position == 3){

            // INITIALIZING ITEM STRINGS TO USE FOR CUSTOM CONTAINER
            itemName1 = mContext.getString(R.string.got);
            itemName2 = mContext.getString(R.string.elafiti);
            itemName3 = mContext.getString(R.string.konavle);
            itemName4 = mContext.getString(R.string.ivan);
            itemName5 = mContext.getString(R.string.pub_crawl);

            description1 = mContext.getString(R.string.got_description);
            description2 = mContext.getString(R.string.elafiti_description);
            description3 = mContext.getString(R.string.konavle_description);
            description4 = mContext.getString(R.string.ivan_description);
            description5 = mContext.getString(R.string.pub_crawl_description);

            phoneNumber1 = mContext.getString(R.string.tel_got);
            phoneNumber2 = mContext.getString(R.string.tel_elafiti);
            phoneNumber3 = mContext.getString(R.string.tel_konavle);
            phoneNumber4 = mContext.getString(R.string.tel_ivan);
            phoneNumber5 = mContext.getString(R.string.tel_pub_crawl);

            location1 = mContext.getString(R.string.loc_got);
            location2 = mContext.getString(R.string.loc_elafiti);
            location3 = mContext.getString(R.string.loc_konavle);
            location4 = mContext.getString(R.string.loc_ivan);
            location5 = mContext.getString(R.string.loc_pub_crawl);

            // INITIALIZING CUSTOM CONTAINER
            one = new Container(itemName1, description1, R.drawable.got, telListener1, locListener2, phoneNumber1, 2.0f);
            two = new Container(itemName2, description2, R.drawable.elafiti, telListener2, locListener2, phoneNumber2, 4.0f);
            three = new Container(itemName3, description3, R.drawable.safari, telListener3, locListener3, phoneNumber3, 4.0f);
            four = new Container(itemName4, description4, R.drawable.ivan, telListener4, locListener4, phoneNumber4, 5.0f);
            five = new Container(itemName5, description5, R.drawable.pub_crawl, telListener5, locListener5, phoneNumber5, 3.0f);

            // INITIALIZING INT COLORS TO SET
            colorBack = R.color.colorTours;
            colorText = R.color.textColorTours;

        } else if (position == 4){

            // INITIALIZING ITEM STRINGS TO USE FOR CUSTOM CONTAINER
            itemName1 = mContext.getString(R.string.maritime);
            itemName2 = mContext.getString(R.string.rupe);
            itemName3 = mContext.getString(R.string.mala_braca);
            itemName4 = mContext.getString(R.string.dominican);
            itemName5 = mContext.getString(R.string.gallery);

            description1 = mContext.getString(R.string.maritime_description);
            description2 = mContext.getString(R.string.rupe_description);
            description3 = mContext.getString(R.string.mala_braca_description);
            description4 = mContext.getString(R.string.dominican_description);
            description5 = mContext.getString(R.string.gallery_description);

            phoneNumber1 = mContext.getString(R.string.tel_maritime);
            phoneNumber2 = mContext.getString(R.string.tel_rupe);
            phoneNumber3 = mContext.getString(R.string.tel_mala_braca);
            phoneNumber4 = mContext.getString(R.string.tel_dominican);
            phoneNumber5 = mContext.getString(R.string.tel_gallery);

            location1 = mContext.getString(R.string.loc_maritime);
            location2 = mContext.getString(R.string.loc_rupe);
            location3 = mContext.getString(R.string.loc_mala_braca);
            location4 = mContext.getString(R.string.loc_dominican);
            location5 = mContext.getString(R.string.loc_gallery);

            // INITIALIZING CUSTOM CONTAINER
            one = new Container(itemName1, description1, R.drawable.pomorski, telListener1, locListener2, phoneNumber1, 5.0f);
            two = new Container(itemName2, description2, R.drawable.rupe, telListener2, locListener2, phoneNumber2, 3.0f);
            three = new Container(itemName3, description3, R.drawable.mala, telListener3, locListener3, phoneNumber3, 4.0f);
            four = new Container(itemName4, description4, R.drawable.dominikanski, telListener4, locListener4, phoneNumber4, 4.0f);
            five = new Container(itemName5,  description5, R.drawable.galerija, telListener5, locListener5, phoneNumber5, 3.0f);

            // INITIALIZING INT COLORS TO SET
            colorBack = R.color.colorAttractions;
            colorText = R.color.textColorAttractions;

        }

    }

}
