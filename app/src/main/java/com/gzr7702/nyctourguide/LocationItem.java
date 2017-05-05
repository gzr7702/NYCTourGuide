package com.gzr7702.nyctourguide;

/**
 * An object that keeps track of a location and its attributes
 */

class LocationItem {
    private String name;
    private String type;
    private String area;
    private String address;
    private int image;

    public LocationItem(String name, String type, String area, String address, int image) {
        this.name = name;
        this.type = type;
        this.area = area;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
