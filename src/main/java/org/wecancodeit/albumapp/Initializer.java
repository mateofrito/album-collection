package org.wecancodeit.albumapp;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.albumapp.models.Album;
import org.wecancodeit.albumapp.models.AlbumComment;
import org.wecancodeit.albumapp.models.Artist;
import org.wecancodeit.albumapp.models.ArtistComment;
import org.wecancodeit.albumapp.models.Song;
import org.wecancodeit.albumapp.models.SongComment;
import org.wecancodeit.albumapp.repositories.AlbumRepository;
import org.wecancodeit.albumapp.repositories.ArtistRepository;
import org.wecancodeit.albumapp.repositories.CommentRepository;
import org.wecancodeit.albumapp.repositories.SongRepository;

@Service
public class Initializer implements CommandLineRunner {
	@Resource
	AlbumRepository albumRepo;
	@Resource
	ArtistRepository artistRepo;
	@Resource
	SongRepository songRepo;
	@Resource
	CommentRepository commentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Artist TestArtist= artistRepo.save(new Artist("Elton John", "https://s3.amazonaws.com/ssglobalcdn/performers/profile/elton-john.jpg", 5));
		Album TestAlbum= albumRepo.save(new Album("Greatest Hits II", "https://i.ytimg.com/vi/p5rQHoaQpTw/hqdefault.jpg", 10,
				TestArtist));
		Song TestSong = songRepo.save(new Song("Goodbye Yellow Brick Road", "3:55", 10, TestAlbum));
		
		commentRepo.save(new ArtistComment("I love Elton!!!", TestArtist));	
		commentRepo.save(new AlbumComment("This album is the greatest, again!", TestAlbum));	
		commentRepo.save(new SongComment("I cried my motherfucking eyes out", TestSong));
	
		artistRepo.save(new Artist("Bob Ross", "https://pbs.twimg.com/profile_images/1878105678/angryBobRoss_400x400.jpg", 5));
		artistRepo.save(new Artist("Van Gogh", "https://www.thoughtco.com/thmb/P9Mhc4RYHi8dgK5sqDTCW5HhpK0=/400x400/filters:no_upscale():max_bytes(150000):strip_icc()/SueBond-13VanGoghSelfP-Stra-56a6e35b5f9b58b7d0e54bca.jpg", 1));
		artistRepo.save(new Artist("GWAR", "https://pbs.twimg.com/profile_images/636793344513974272/FspNM2JA_400x400.jpg", 666));
		artistRepo.save(new Artist("Jonas Brothers", "https://pbs.twimg.com/profile_images/1105726641895100416/ZIa6THm7_400x400.png", 3));
		artistRepo.save(new Artist("BTS", "https://pbs.twimg.com/profile_images/1012002776954621955/7tnbbhbH_400x400.jpg", 10));
		artistRepo.save(new Artist("LMFAO","https://www.hotnewhiphop.com/image/500x500/cover/1342213215_2d367a6dde08e07b7350ef4af2016661.jpg/8a9ca32b863478032c0decb6a76c2dca/1342213215_lmfao.jpg", 8));

		
	}

}
