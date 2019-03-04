package com.detroitlabs.photoalbum.model;

public class PhotoAlbum {
    String pictureName;
    String countryName;
    int countryID;

    public PhotoAlbum(String pictureName, String countryName, int countryID) {
        this.pictureName = pictureName;
        this.countryName = countryName;
        this.countryID = countryID;
    }

    public int getCountryID() {
        return countryID;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
