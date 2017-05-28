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
public class EntertainmentActivity extends AppCompatActivity {
    ArrayList<LocationItem> mEntertainment = new ArrayList<LocationItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        generateData();
        ArrayAdapter adapter = new LocationAdapter(this, mEntertainment);
        final ListView listView = (ListView) findViewById(R.id.entertainment_list);
        listView.setAdapter(adapter);
    }

    private void generateData() {
        // array w/pics
        int[] pics = {R.drawable.lincoln, R.drawable.msg, R.drawable.carnegie, R.drawable.shubert, R.drawable.ev_bar};

        TypedArray entertainmentData = getResources().obtainTypedArray(R.array.entertainment_locations);
        TypedArray itemDef;

        // Iterate through array and get each location array
        for (int i = 0; i < entertainmentData.length(); i++) {
            int resId = entertainmentData.getResourceId(i, -1);
            if (resId < 0) {
                continue;
            }

            itemDef = getResources().obtainTypedArray(resId);
            // Create object w/name and address
            mEntertainment.add(new LocationItem(itemDef.getString(0),itemDef.getString(1), pics[i]));
        }
    }
}
