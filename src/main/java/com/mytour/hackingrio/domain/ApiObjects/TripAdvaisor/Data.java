package com.mytour.hackingrio.domain.ApiObjects.TripAdvaisor;

public class Data {
    public AddressObj address_obj;
    public String distance;
    public String bearing;
    public String name;
    public String location_id;

    public Data( ) {}

    public AddressObj getAddress_obj() {
        return address_obj;
    }

    public void setAddress_obj(AddressObj address_obj) {
        this.address_obj = address_obj;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getBearing() {
        return bearing;
    }

    public void setBearing(String bearing) {
        this.bearing = bearing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }
}
