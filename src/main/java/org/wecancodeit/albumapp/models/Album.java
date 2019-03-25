package org.wecancodeit.albumapp.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Album {

	@Id
	@GeneratedValue
	private Long albumId;
	private String albumTitle;
	@Lob
	private String albumCover;
	private int albumRating;
	@ManyToOne
	@JsonIgnore
	private Artist artist;
	@OneToMany(mappedBy = "album")
	private Collection<Song> songs;
	@OneToMany(mappedBy = "album")
	private Collection<AlbumComment> albumComments;

	public Album() {
	}

	public Album(String albumTitle, String albumCover, int albumRating, Artist artist) {
		this.albumTitle = albumTitle;
		this.albumCover = albumCover;
		this.albumRating = albumRating;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	public Artist getArtist() {
		return artist;
	}

	public Collection<Song> getSongs() {
		return songs;
	}

	public Collection<AlbumComment> getAlbumComments() {
		return albumComments;
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
		return "Album [albumTitle=" + albumTitle + ", albumCover=" + albumCover + ", albumRating=" + albumRating
				+ ", artist=" + artist + "]";
	}

}
