package org.wecancodeit.albumapp;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.albumapp.models.Album;
import org.wecancodeit.albumapp.models.Artist;
import org.wecancodeit.albumapp.models.Song;
import org.wecancodeit.albumapp.repositories.AlbumRepository;
import org.wecancodeit.albumapp.repositories.ArtistRepository;
import org.wecancodeit.albumapp.repositories.SongRepository;

@Service
public class Initializer implements CommandLineRunner {
	@Resource
	AlbumRepository albumRepo;
	@Resource
	ArtistRepository artistRepo;
	@Resource
	SongRepository songRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Artist TestArtist= artistRepo.save(new Artist("George", "Image", 5));
		Album TestAlbum= albumRepo.save(new Album("Album Title", "Album Cover", 10,
				TestArtist));
		songRepo.save(new Song("Test Song", "duration", 10, TestAlbum));
		
		
	}

}
