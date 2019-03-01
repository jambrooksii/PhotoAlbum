package com.detroitlabs.photoalbum.model;

public class PhotoAlbum {
    String pictureName;
    String countryName;

    public PhotoAlbum(String pictureName, String countryName) {
        this.pictureName = pictureName;
        this.countryName = countryName;
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
