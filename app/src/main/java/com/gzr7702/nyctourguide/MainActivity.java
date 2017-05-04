package com.gzr7702.nyctourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get all Buttons
        Button restaurantButton = (Button) findViewById(R.id.restaurant_button);
        Button sightsButton = (Button) findViewById(R.id.sights_button);
        Button entertainmentButton = (Button) findViewById(R.id.entertainment_button);
        Button hotelButton = (Button) findViewById(R.id.hotel_button);

        // Set up callbacks
        restaurantButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                startActivity(intent);
            }
        });

        sightsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SightsActivity.class);
                startActivity(intent);
            }
        });

        entertainmentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EntertainmentActivity.class);
                startActivity(intent);
            }
        });

        hotelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HotelActivity.class);
                startActivity(intent);
            }
        });
    }
}
