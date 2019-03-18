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
	
//	private Album albums;
	
	
	public Artist(String artistName, String artistImage) {
		super();
		this.artistName = artistName;
		this.artistImage = artistImage;
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
	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + ", artistImage=" + artistImage + "]";
	}
	
	
	
	

}
