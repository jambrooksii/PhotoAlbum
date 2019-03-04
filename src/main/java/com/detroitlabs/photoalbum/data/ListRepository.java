package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.PhotoAlbum;
import com.detroitlabs.photoalbum.model.PhotoList;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Component
public class ListRepository {
    PhotoAlbumRepository photoAlbumRepository;
    PhotoList photoList;
    private static final List<PhotoList> ALL_CATEGORIES = Arrays.asList(
         new PhotoList("Japan", 1),
            new PhotoList("Thailand", 2),
            new PhotoList("Cambodia", 3),
            new PhotoList("Taiwan", 4)

    );

    public List<PhotoList> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public PhotoList findById(@PathVariable Integer countryID) {
        for (PhotoList photoList : ALL_CATEGORIES) {
            if (photoList.getCountryID() == countryID) {
                return photoList;
            }

        }
        return null;
    }

}

