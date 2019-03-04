package com.detroitlabs.photoalbum.model;

public class PhotoList {
    String countryName;
    int countryID;

    public PhotoList(String countryName, int countryID) {
        this.countryName = countryName;
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }
}
