package com.detroitlabs.photoalbum.controller;

import com.detroitlabs.photoalbum.data.ListRepository;
import com.detroitlabs.photoalbum.data.PhotoAlbumRepository;
import com.detroitlabs.photoalbum.model.PhotoAlbum;
import com.detroitlabs.photoalbum.model.PhotoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PhotoListController {
    @Autowired
    private PhotoAlbumRepository photoAlbumRepository;

    @Autowired
    private ListRepository listRepository;

    @RequestMapping("/categories")
    public String displayCategory(ModelMap modelMap) {
        List<PhotoList> allCategories = listRepository.getAllCategories();
        modelMap.put("allCategories", allCategories);
        return "categories";
    }

    @RequestMapping("/photoList/{countryID}")
    public String category(@PathVariable int countryID, ModelMap modelMap){

        PhotoList photoList = listRepository.findById(countryID);
        modelMap.put("photoList", photoList);

        List<PhotoAlbum> japanPhotos = photoAlbumRepository.findCountry(1);
        modelMap.put("japanPhotos", japanPhotos);

        List<PhotoAlbum> thailandPhotos = photoAlbumRepository.findCountry(2);
        modelMap.put("thailandPhotos", thailandPhotos);

        List<PhotoAlbum> cambodiaPhotos = photoAlbumRepository.findCountry(3);
        modelMap.put("cambodiaPhotos", cambodiaPhotos);

        List<PhotoAlbum> taiwanPhotos = photoAlbumRepository.findCountry(4);
        modelMap.put("taiwanPhotos", taiwanPhotos);

        

        

        return "category";

    }
//    @RequestMapping("/search")
//    public String searchForGifs(@PathVariable String search, ModelMap modelMap){
//        List<Gif> gifSearch =  gifRepository.searchForGif(search);
//        modelMap.put("gifSearch", gifSearch);
//
//        return search;
//    }
}
