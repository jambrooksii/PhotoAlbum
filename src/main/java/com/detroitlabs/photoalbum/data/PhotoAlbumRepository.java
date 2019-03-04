package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.PhotoAlbum;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class PhotoAlbumRepository {
    ListRepository listRepository;

    private static final List<PhotoAlbum> Country_LIST = Arrays.asList(
            new PhotoAlbum("ankorCambodia", "Cambodia", 3),
            new PhotoAlbum("babyCambodia", "Cambodia", 3),
            new PhotoAlbum("babyJapan", "Japan", 1),
            new PhotoAlbum("boatThailand", "Thailand", 2),
            new PhotoAlbum("bucketsThailand", "Thailand", 2),
            new PhotoAlbum("candyJapan", "Japan", 1),
            new PhotoAlbum("clubTaiwan", "Taiwan", 4),
            new PhotoAlbum("cowsCambodia", "Cambodia", 3),
            new PhotoAlbum("crewTaiwan", "Cambodia", 3),
            new PhotoAlbum("devonCambodia", "Cambodia", 3),
            new PhotoAlbum("devonJapan", "Japan", 1),
            new PhotoAlbum("familyTaiwan", "Taiwan", 4),
            new PhotoAlbum("fieldCambodia", "Cambodia", 3),
            new PhotoAlbum("gongCambodia", "Cambodia", 3),
            new PhotoAlbum("jamdevCambodia", "Cambodia", 3),
            new PhotoAlbum("jamesbondThailand", "Thailand", 2),
            new PhotoAlbum("jamieCambodia", "Cambodia", 3),
            new PhotoAlbum("kayakThailand", "Thailand", 2),
            new PhotoAlbum("kidsCambodia", "Cambodia", 3),
            new PhotoAlbum("motosThailand", "Thailand", 2),
            new PhotoAlbum("motoTaiwan", "Taiwan", 4),
            new PhotoAlbum("musicJapan", "Japan", 1),
            new PhotoAlbum("partyTaiwan", "Taiwan", 4),
            new PhotoAlbum("riceCakeJapan", "Japan", 1),
            new PhotoAlbum("skyJapan", "Japan", 1),
            new PhotoAlbum("statueCambodia", "Cambodia", 3),
            new PhotoAlbum("statueThailand", "Thailand", 2),
            new PhotoAlbum("tempelTaiwan", "Taiwan", 4),
            new PhotoAlbum("tempelThailand", "Thailand", 2),
            new PhotoAlbum("treeTaiwan", "Taiwan", 4),
            new PhotoAlbum("waterThailand", "Thailand", 2));

    public List<PhotoAlbum> getCountry_LIST() {
        return Country_LIST;
    }

    public List<PhotoAlbum> findCountry(int countryID) {
        List<PhotoAlbum> photoAlbums = new ArrayList<>();
        for (PhotoAlbum photoAlbum : Country_LIST) {
            if (photoAlbum.getCountryID() == countryID) {
                photoAlbums.add(photoAlbum);

            }

        }
        return photoAlbums;

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

    public List findJapanPhotos(){
        List<PhotoAlbum> japanPhotos = new ArrayList<>();
        for(PhotoAlbum photoAlbum: Country_LIST){
            if(photoAlbum.getCountryID() == 1){
                japanPhotos.add(photoAlbum);
            }
        }
        return japanPhotos;
    }


    public List findTaiwanPhotos(){
        List<PhotoAlbum> taiwanPhotos = new ArrayList<>();
        for(PhotoAlbum photoAlbum: Country_LIST){
            if(photoAlbum.getCountryID() == 4){
                taiwanPhotos.add(photoAlbum);
            }
        }
        return taiwanPhotos;
    }

    public List findThailandPhotos(){
        List<PhotoAlbum> thailandPhotos = new ArrayList<>();
        for(PhotoAlbum photoAlbum: Country_LIST){
            if(photoAlbum.getCountryID() == 2){
                thailandPhotos.add(photoAlbum);
            }
        }
        return thailandPhotos;
    }

    public List findCambodiaPhotos(){
        List<PhotoAlbum> cambodiaPhotos = new ArrayList<>();
        for(PhotoAlbum photoAlbum: Country_LIST){
            if(photoAlbum.getCountryID() == 3){
                cambodiaPhotos.add(photoAlbum);
            }
        }
        return cambodiaPhotos;
    }




}
