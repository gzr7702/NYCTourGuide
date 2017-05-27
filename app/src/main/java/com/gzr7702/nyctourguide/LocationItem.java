package com.gzr7702.nyctourguide;

/**
 * An object that keeps track of a location and its attributes
 */

class LocationItem {
    private String name;
    private String address;
    private int image;

    public LocationItem(String name, String address, int image) {
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getImage() {
        return image;
    }
}
