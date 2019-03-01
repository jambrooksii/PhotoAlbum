package com.detroitlabs.photoalbum.controller;

import com.detroitlabs.photoalbum.data.PhotoAlbumRepository;
import com.detroitlabs.photoalbum.model.PhotoAlbum;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PhotoAlbumController {

    @Autowired
 private PhotoAlbumRepository photoAlbumRepository;

    @RequestMapping("/")
    public String displayAllPhotos(ModelMap modelMap){
        List<PhotoAlbum> allPhotos = photoAlbumRepository.getCountry_LIST();
        modelMap.put("allPhotos", allPhotos)

    }

}
