package org.wecancodeit.albumapp.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.albumapp.models.Song;
import org.wecancodeit.albumapp.repositories.SongRepository;

@RestController
@RequestMapping("/songs")
public class SongController {

@Resource
SongRepository songRepo;

@GetMapping("")
public Collection<Song>getSongs() {
	return (Collection<Song>)songRepo.findAll();
	
}






}
