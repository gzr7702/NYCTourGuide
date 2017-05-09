package com.gzr7702.nyctourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/*
    This activity displays the music files that are on the device.
 */

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
        mEntertainment.add(new LocationItem("Lincoln Center", "10 Lincoln Center Plaza", R.drawable.lincoln));
        mEntertainment.add(new LocationItem("Madison Square Garden", "4 Pennsylvania Plaza", R.drawable.msg));
        mEntertainment.add(new LocationItem("Carnegie Hall", "881 7th Ave", R.drawable.carnegie));
        mEntertainment.add(new LocationItem("Shubert Theater", "225 W 44th St", R.drawable.shubert));
        mEntertainment.add(new LocationItem("East Village", "Avenue A and St Mark's Place", R.drawable.ev_bar));
    }
}
