package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue
	private Long artistId;
	private String artistName;
	private String artistImage;
	private int artistRating;
	
//	private Album albums;
	
	
	public Artist(String artistName, String artistImage, int artistRating) {
		super();
		this.artistName = artistName;
		this.artistImage = artistImage;
		this.artistRating = artistRating;
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
	@Override
	public String toString() {
		return "artistId=" + artistId + ", artistName=" + artistName + ", artistImage=" + artistImage
				+ ", artistRating=" + artistRating;
	}
}
