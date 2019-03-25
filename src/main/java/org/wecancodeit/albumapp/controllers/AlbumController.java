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
import org.wecancodeit.albumapp.models.Album;
import org.wecancodeit.albumapp.models.Artist;
import org.wecancodeit.albumapp.repositories.AlbumRepository;
import org.wecancodeit.albumapp.repositories.ArtistRepository;

@RestController
@RequestMapping("/albums")
public class AlbumController {
	
	@Resource
	AlbumRepository albumRepo;
	
	@Resource 
	ArtistRepository artistRepo;
	
	@GetMapping("")
	public Collection<Album> getAlbums() {
		return (Collection<Album>)albumRepo.findAll();
		
	}

	@PostMapping("/add")
	public Collection<Artist>addAlbum(@RequestBody String body) throws JSONException {
		
		JSONObject newAlbum = new JSONObject(body);
	String albumTitle = newAlbum.getString("albumTitle");
	String albumCover = newAlbum.getString("albumCover");
	int albumRating = Integer.parseInt(newAlbum.getString("albumRating"));
	Artist artist = artistRepo.findByArtistName(newAlbum.getString("artist"));
	albumRepo.save(new Album (albumTitle, albumCover, albumRating, artist));
		return (Collection<Artist>)artistRepo.findAll();
	}
}
