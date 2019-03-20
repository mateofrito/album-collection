package org.wecancodeit.albumapp.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.albumapp.models.Artist;
import org.wecancodeit.albumapp.repositories.ArtistRepository;

@RestController
@RequestMapping("/artists")
public class ArtistController {
	
	//Resources	
	@Resource
	ArtistRepository artistRepo;
	
	@GetMapping("")
	public Collection<Artist>getArtists() {
		return (Collection<Artist>)artistRepo.findAll();
		
	}

}
