package com.gzr7702.nyctourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Get all Buttons
        Button restaurantButton = (Button) findViewById(R.id.restaurant_button);
        Button sightsButton = (Button) findViewById(R.id.sights_button);
        Button entertainmentButton = (Button) findViewById(R.id.entertainment_button);
        Button hotelButton = (Button) findViewById(R.id.hotel_button);

        restaurantButton.setOnClickListener(this);
        sightsButton.setOnClickListener(this);
        entertainmentButton.setOnClickListener(this);
        hotelButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.restaurant_button:
                intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                startActivity(intent);
                break;
            case R.id.sights_button:
                intent = new Intent(getApplicationContext(), SightsActivity.class);
                startActivity(intent);
                break;
            case R.id.entertainment_button:
                intent = new Intent(getApplicationContext(), EntertainmentActivity.class);
                startActivity(intent);
                break;
            case R.id.hotel_button:
                intent = new Intent(getApplicationContext(), EntertainmentActivity.class);
                startActivity(intent);
                break;
        }
    }
}
