package com.gzr7702.nyctourguide;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/*
    This activity displays the music files that are on the device.
 */

@SuppressWarnings("ResourceType")
public class RestaurantActivity extends AppCompatActivity {
    ArrayList<LocationItem> mRestaurants = new ArrayList<LocationItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        generateData();
        ArrayAdapter adapter = new LocationAdapter(this, mRestaurants);
        final ListView listView = (ListView) findViewById(R.id.restaurant_list);
        listView.setAdapter(adapter);
    }

    private void generateData() {
        TypedArray restaurantData = getResources().obtainTypedArray(R.array.restaurant_locations);
        TypedArray itemDef;

        for (int i = 0; i < restaurantData.length(); i++) {
            int resId = restaurantData.getResourceId(i, -1);
            if (resId < 0) {
                continue;
            }

            itemDef = getResources().obtainTypedArray(resId);
            mRestaurants.add(new LocationItem(itemDef.getString(0),itemDef.getString(1), R.drawable.restaurant));
        }
    }
}

