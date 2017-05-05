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
    // TODO: make this a generic activity?
    ArrayList<LocationItem> mRestaurants = new ArrayList<LocationItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        //generateData();
        ArrayAdapter adapter = new LocationAdapter(this, mRestaurants);
        final ListView listView = (ListView) findViewById(R.id.restaurant_list);
        listView.setAdapter(adapter);
    }

    /*
    private void generateData() {
        mSongs.add(new SongItem("Song List"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Stairway to Heaven"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Let's Dance"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Master of Puppets"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Live till You Die"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Umbrella"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Rolling in the Deep"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Just Dance"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Whiskey in the Jar"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Mr. Brightside"));
        mSongs.add(new SongItem(R.drawable.audio_file, "War Pigs"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Ghost Town"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Message in a Bottle"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Billie Jean"));
        mSongs.add(new SongItem(R.drawable.audio_file, "Bohemian Rhapsody"));
    }
    */
}

