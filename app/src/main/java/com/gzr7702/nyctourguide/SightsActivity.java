package com.gzr7702.nyctourguide;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/*
    This activity displays the music files that are on the device.
 */

@SuppressWarnings("ResourceType")
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
        TypedArray siteData= getResources().obtainTypedArray(R.array.site_locations);
        TypedArray itemDef;

        int[] pics = {R.drawable.empire_state_real, R.drawable.liberty, R.drawable.nat_hist,
                R.drawable.times, R.drawable.met};

        // Iterate through array and get each location array
        for (int i = 0; i < siteData.length(); i++) {
            int resId = siteData.getResourceId(i, -1);
            if (resId < 0) {
                continue;
            }

            itemDef = getResources().obtainTypedArray(resId);
            // Create object w/name and address
            mSights.add(new LocationItem(itemDef.getString(0),itemDef.getString(1), pics[i]));
        }
    }
}


