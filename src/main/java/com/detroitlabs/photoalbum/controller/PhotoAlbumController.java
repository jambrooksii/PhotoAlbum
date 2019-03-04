package com.detroitlabs.photoalbum.controller;

import com.detroitlabs.photoalbum.data.ListRepository;
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

    @Autowired
    private ListRepository listRepository;

    @RequestMapping("/")
    public String displayAllPhotos(ModelMap modelMap) {
        List<PhotoAlbum> photo = photoAlbumRepository.getCountry_LIST();
        modelMap.put("photo", photo);
        return "home";
    }

    @RequestMapping("/photo/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        PhotoAlbum photo = photoAlbumRepository.findByName(name);
        modelMap.put("photo", photo);
        return "home";

    }

    @RequestMapping("/japan")
    public String photoDetails(Integer countryID, ModelMap modelMap) {
        List<PhotoAlbum> photos = photoAlbumRepository.findJapanPhotos();
        modelMap.put("photos", photos);
        return "japan";

    }

    @RequestMapping("/taiwan")
    public String photoDetailsTaiwan(ModelMap modelMap) {
        List<PhotoAlbum> photos = photoAlbumRepository.findTaiwanPhotos();
        modelMap.put("photos", photos);
        return "taiwan";

    }

    @RequestMapping("/cambodia")
    public String photoDetailsCambodia(ModelMap modelMap) {
        List<PhotoAlbum> photos = photoAlbumRepository.findCambodiaPhotos();
        modelMap.put("photos", photos);
        return "cambodia";
    }

    @RequestMapping("/thailand")
    public String photoDetailsThailand(ModelMap modelMap) {
        List<PhotoAlbum> photos = photoAlbumRepository.findThailandPhotos();
        modelMap.put("photos", photos);
        return "thailand";
    }

    @RequestMapping("/allPictures")
    public String allPictures(ModelMap modelMap) {
        List<PhotoAlbum> photos = photoAlbumRepository.getCountry_LIST();
        modelMap.put("photos", photos);
        return "allPictures";
    }
}


