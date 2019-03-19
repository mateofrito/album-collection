package org.wecancodeit.albumapp.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.albumapp.models.Album;
import org.wecancodeit.albumapp.repositories.AlbumRepository;

@RestController
@RequestMapping("/albums")
public class AlbumController {
	
	@Resource
	AlbumRepository albumRepo;
	
	@GetMapping("")
	public Collection<Album> getAlbums() {
		return (Collection<Album>)albumRepo.findAll();
		
	}

}
