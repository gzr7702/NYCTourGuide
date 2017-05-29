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

    // Class to use View Holder pattern
    private class ViewHolder {
        ImageView imgView;
        TextView nameView;
        TextView addressView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = null;
        ViewHolder holder = new ViewHolder();

        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            rowView = inflater.inflate(R.layout.locationview_item, parent, false);

            holder.imgView = (ImageView) rowView.findViewById(R.id.icon);
            holder.nameView = (TextView) rowView.findViewById(R.id.location_name);
            holder.addressView = (TextView) rowView.findViewById(R.id.location_address);

            holder.imgView.setImageResource(locationArrayList.get(position).getImage());
            holder.nameView.setText(locationArrayList.get(position).getName());
            holder.addressView.setText(locationArrayList.get(position).getAddress());
            rowView.setTag(holder);

        } else {
            holder = (ViewHolder) rowView.getTag();
        }

        return rowView;
    }
}

