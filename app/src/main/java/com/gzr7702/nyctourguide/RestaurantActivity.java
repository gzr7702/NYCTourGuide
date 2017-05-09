package com.gzr7702.nyctourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gzr7702.nyctourguide.R;

import java.util.ArrayList;


/*
    This activity displays the music files that are on the device.
 */

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
        mRestaurants.add(new LocationItem("Katz's Deli", "LES", "22 Orchard St", R.drawable.restaurant));
        mRestaurants.add(new LocationItem("Sal's Pizza", "LES", "40 Orchard St", R.drawable.restaurant));
        mRestaurants.add(new LocationItem("Nobu", "Tribecca", "195 Broadway", R.drawable.restaurant));
        mRestaurants.add(new LocationItem("Song' 'e Napule", "Village", "201 Houston St", R.drawable.restaurant));
        mRestaurants.add(new LocationItem("Spark's Steak House", "Midtown", "210 E 46th Street", R.drawable.restaurant));
    }
}

