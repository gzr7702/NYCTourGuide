package com.gzr7702.nyctourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<LocationItem> {

    private final Context context;
    private final ArrayList<LocationItem> locationArrayList;

    public LocationAdapter(Context context, ArrayList<LocationItem> locationArrayList) {

        super(context, R.layout.locationview_item, locationArrayList);

        this.context = context;
        this.locationArrayList = locationArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View rowView = null;
        rowView = inflater.inflate(R.layout.locationview_item, parent, false);

        ImageView imgView = (ImageView) rowView.findViewById(R.id.icon);
        TextView nameView = (TextView) rowView.findViewById(R.id.location_name);
        TextView addressView = (TextView) rowView.findViewById(R.id.location_address);


        imgView.setImageResource(locationArrayList.get(position).getImage());
        nameView.setText(locationArrayList.get(position).getName());
        addressView.setText(locationArrayList.get(position).getAddress());

        return rowView;
    }
}

