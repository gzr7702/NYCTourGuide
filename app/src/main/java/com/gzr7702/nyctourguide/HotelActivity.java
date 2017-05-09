package com.gzr7702.nyctourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/*
    This activity displays the music files that are on the device.
 */

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
        mHotels.add(new LocationItem("Four Seasons", "27 Barclay St", R.drawable.hotel));
        mHotels.add(new LocationItem("Holiday Inn", "99 Washington St", R.drawable.hotel));
        mHotels.add(new LocationItem("La Quinta", "17 W 32nd St", R.drawable.hotel));
        mHotels.add(new LocationItem("Comfort Inn", "61-63 Chrystie St", R.drawable.hotel));
        mHotels.add(new LocationItem("Manhattan Broadway Hotel", "273 W 38th St", R.drawable.hotel));
    }
}

