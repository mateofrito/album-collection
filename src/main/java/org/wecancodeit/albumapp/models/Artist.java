package org.wecancodeit.albumapp.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue
	private Long artistId;
	private String artistName;
	@Lob
	private String artistImage;
	private int artistRating;
	@OneToMany(mappedBy="artist")
	private Collection <Album> albums;
	@OneToMany(mappedBy="artist")
	private Collection <ArtistComment> artistComments;	
	
	public Artist() {}
	
	public Artist(String artistName, String artistImage, int artistRating) {
		this.artistName = artistName;
		this.artistImage = artistImage;
		this.artistRating = artistRating;
		this.albums = new ArrayList<Album>();
	}
	
	public Collection<ArtistComment> getArtistComments() {
		return artistComments;
	}
	
	public Long getArtistId() {
		return artistId;
	}
	
	public String getArtistName() {
		return artistName;
	}
	
	public String getArtistImage() {
		return artistImage;
	}
	
	public int getArtistRating() {
		return artistRating;
	}
	
	public Collection<Album> getAlbums() {
		return albums;
	}
	
	@Override
	public String toString() {
		return "artistId=" + artistId + ", artistName=" + artistName + ", artistImage=" + artistImage
				+ ", artistRating=" + artistRating;
	}
}
