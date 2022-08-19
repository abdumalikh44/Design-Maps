package com.example.googlemaps;

public class Model {

    String latitude, longitude, Address, AddressTwo, HeadLine, description;

    public Model() {

    }

    public Model(String latitude, String longitude, String address, String addressTwo, String headLine, String description) {
        this.latitude = latitude;
        this.longitude = longitude;
        Address = address;
        AddressTwo = addressTwo;
        HeadLine = headLine;
        this.description = description;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddressTwo() {
        return AddressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        AddressTwo = addressTwo;
    }

    public String getHeadLine() {
        return HeadLine;
    }

    public void setHeadLine(String headLine) {
        HeadLine = headLine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
