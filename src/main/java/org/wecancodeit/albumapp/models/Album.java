package org.wecancodeit.albumapp.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Album {
	
	@Id
	@GeneratedValue
	private Long albumId;

	private String albumTitle;

	private String albumCover;
	private int albumRating;
	@ManyToOne 
	private Artist artist;
	@OneToMany(mappedBy="album")
	private Collection <Song> songs;
	public Album() {}
	
	public Album(String albumTitle, String albumCover, int albumRating,
			Artist artist) {
		this.albumTitle = albumTitle;
		this.albumCover = albumCover;
		this.albumRating = albumRating;
		this.artist = artist;
	}

	public Artist getArtist() {
		return artist;
	}

	public Long getAlbumId() {
		return albumId;
	}
	
	public String getAlbumTitle() {
		return albumTitle;
	}
	
	
	public String getAlbumCover() {
		return albumCover;
	}
	public int getAlbumRating() {
		return albumRating;
	}


	@Override
	public String toString() {
		return "Album [albumTitle=" + albumTitle + ", albumCover=" + albumCover
				+ ", albumRating=" + albumRating + ", artist=" + artist + "]";
	}
	


}
