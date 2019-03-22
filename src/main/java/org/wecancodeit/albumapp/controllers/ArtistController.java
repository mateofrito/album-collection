package org.wecancodeit.albumapp.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/add")
	public Collection<Artist>addArtist(@RequestBody String body) throws JSONException {
		JSONObject newArtist = new JSONObject(body);
	String artistName = newArtist.getString("artistName");
	String artistImage =newArtist.getString("artistImage");
	int artistRating =Integer.parseInt(newArtist.getString("artistRating"));
	artistRepo.save(new Artist (artistName, artistImage, artistRating ));
		return (Collection<Artist>)artistRepo.findAll();
}
}
