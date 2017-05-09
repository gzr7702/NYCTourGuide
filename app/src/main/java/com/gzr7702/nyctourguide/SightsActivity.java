package com.gzr7702.nyctourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/*
    This activity displays the music files that are on the device.
 */

public class SightsActivity extends AppCompatActivity {
    ArrayList<LocationItem> mSights = new ArrayList<LocationItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);

        generateData();
        ArrayAdapter adapter = new LocationAdapter(this, mSights);
        final ListView listView = (ListView) findViewById(R.id.sights_list);
        listView.setAdapter(adapter);
    }

    private void generateData() {
        mSights.add(new LocationItem("Empire State Building", "350 5th Ave", R.drawable.empire_state_real));
        mSights.add(new LocationItem("Statue of Liberty", "Liberty Island", R.drawable.liberty));
        mSights.add(new LocationItem("Amercian Musuem of Natural History", "Central Park West & 79th St", R.drawable.nat_hist));
        mSights.add(new LocationItem("Times Square", "Broadway and 42nd Street", R.drawable.times));
        mSights.add(new LocationItem("Metropolitan Museum of Art", "1000 5th Ave", R.drawable.met));
    }
}


