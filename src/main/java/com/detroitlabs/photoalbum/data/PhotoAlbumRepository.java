package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.PhotoAlbum;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class PhotoAlbumRepository {

    private static final List<PhotoAlbum> Country_LIST = Arrays.asList(
            new PhotoAlbum("ankorCambodia", "Cambodia"),
            new PhotoAlbum("babyCambodia", "Cambodia"),
            new PhotoAlbum("babyJapan", "Japan"),
            new PhotoAlbum("boatThailand", "Thailand"),
            new PhotoAlbum("bucketsThailand", "Thailand"),
            new PhotoAlbum("candyJapan", "Japan"),
            new PhotoAlbum("clubTaiwan", "Taiwan"),
            new PhotoAlbum("cowsCambodia", "Cambodia"),
            new PhotoAlbum("crewTaiwan", "Cambodia"),
            new PhotoAlbum("devonCambodia", "Cambodia"),
            new PhotoAlbum("devonJapan", "Japan"),
            new PhotoAlbum("familyTaiwan", "Taiwan"),
            new PhotoAlbum("fieldCambodia", "Cambodia"),
            new PhotoAlbum("gongCambodia", "Cambodia"),
            new PhotoAlbum("jamdevCambodia", "Cambodia"),
            new PhotoAlbum("jamesbondThailand", "Thailand"),
            new PhotoAlbum("jamieCambodia", "Cambodia"),
            new PhotoAlbum("kayakThailand", "Thailand"),
            new PhotoAlbum("kidsCambodia", "Cambodia"),
            new PhotoAlbum("motosThailand", "Thailand"),
            new PhotoAlbum("motoTaiwan", "Taiwan"),
            new PhotoAlbum("musicJapan", "Japan"),
            new PhotoAlbum("partyTaiwan", "Taiwan"),
            new PhotoAlbum("riceCakeJapan", "Japan"),
            new PhotoAlbum("skyJapan", "Japan"),
            new PhotoAlbum("statueCambodia", "Cambodia"),
            new PhotoAlbum("statueThailand", "Thailand"),
            new PhotoAlbum("tempelTaiwan", "Taiwan"),
            new PhotoAlbum("tempelThailand", "Thailand"),
            new PhotoAlbum("treeTaiwan", "Taiwan"),
            new PhotoAlbum("waterThailand", "Thailand"));

    public List<PhotoAlbum> getCountry_LIST() {
        return Country_LIST;
    }

    public List<PhotoAlbum> findByCountry(@PathVariable String countryName) {
        List<PhotoAlbum> pickByCountry = new ArrayList<>();
        for (PhotoAlbum photoAlbum : Country_LIST) {
            if (photoAlbum.getCountryName() == countryName) {
                pickByCountry.add(photoAlbum);
            }
        }
        return pickByCountry;
    }

    public PhotoAlbum findByName(@PathVariable String name) {
        for (PhotoAlbum photoAlbum : Country_LIST) {
            if (photoAlbum.getCountryName().equals(name)) {
                return photoAlbum;
            }
        }
        return null;
    }

    public PhotoAlbum findCountry(@PathVariable String counryName) {
        for (PhotoAlbum photoAlbum : Country_LIST) {
            if (photoAlbum.getCountryName() == counryName) {
                return photoAlbum;
            }

        }
        return null;
    }




}
