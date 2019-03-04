package com.detroitlabs.photoalbum.controller;

import com.detroitlabs.photoalbum.data.PhotoAlbumRepository;
import com.detroitlabs.photoalbum.model.PhotoAlbum;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PhotoAlbumController {

    @Autowired
    private PhotoAlbumRepository photoAlbumRepository;

    @RequestMapping("/")
    public String displayAllPhotos(ModelMap modelMap) {
        List<PhotoAlbum> allPhotos = photoAlbumRepository.getCountry_LIST();
        modelMap.put("allPhotos", allPhotos);
        return "home";
    }

    @RequestMapping("/japan/{countryName}")
    public String findPhotos(@PathVariable String countryName, ModelMap modelMap){
        List<PhotoAlbum> photoAlbum = photoAlbumRepository.findByCountry(countryName);
        modelMap.put("photoAlbum", photoAlbum);
        return "japan";

    }

    @RequestMapping("/photos/{name}")
    public String photoDetails(@PathVariable String name, ModelMap modelMap){
        PhotoAlbum photo = photoAlbumRepository.findByName(name);
        modelMap.put("photo", photo);
        return "japan";

    }

//    @RequestMapping("/taiwan/{countryName}")
//    public String findPhotos(@PathVariable String countryName, ModelMap modelMap){
//        List<PhotoAlbum> photoAlbum = photoAlbumRepository.findByCountry(countryName);
//        modelMap.put("photoAlbum", photoAlbum);
//        return "taiwan";
//
//    }

}
