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
public class HotelActivity extends AppCompatActivity {
    ArrayList<LocationItem> mHotels = new ArrayList<LocationItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        generateData();
        ArrayAdapter adapter = new LocationAdapter(this, mHotels);
        final ListView listView = (ListView) findViewById(R.id.hotel_list);
        listView.setAdapter(adapter);
    }

    private void generateData() {
        TypedArray hotelData= getResources().obtainTypedArray(R.array.hotel_locations);
        TypedArray itemDef;

        // Iterate through array and get each location array
        for (int i = 0; i < hotelData.length(); i++) {
            int resId = hotelData.getResourceId(i, -1);
            if (resId < 0) {
                continue;
            }

            itemDef = getResources().obtainTypedArray(resId);
            // Create object w/name and address
            mHotels.add(new LocationItem(itemDef.getString(0),itemDef.getString(1), R.drawable.hotel));
        }
    }
}

