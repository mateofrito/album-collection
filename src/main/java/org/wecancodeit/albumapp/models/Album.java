package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Album {
	
	@Id
	@GeneratedValue
	private Long albumId;

	private String albumTitle;

	private String tracks;
	private String recordLabel;
	private String albumCover;
	private int albumRating;
	
	public Album() {}
	
	public Album(String albumTitle, String tracks, String recordLabel, String albumCover, int albumRating) {
		
		this.albumTitle = albumTitle;
		this.tracks = tracks;
		this.recordLabel = recordLabel;
		this.albumCover = albumCover;
		this.albumRating = albumRating;
	}
	

	public Long getAlbumId() {
		return albumId;
	}
	
	public String getAlbumTitle() {
		return albumTitle;
	}
	
	public String getTracks() {
		return tracks;
	}
	
	public String getRecordLabel() {
		return recordLabel;
	}
	
	public String getAlbumCover() {
		return albumCover;
	}
	public int getAlbumRating() {
		return albumRating;
	}


	@Override
	public String toString() {
		return "albumTitle=" + albumTitle + ", tracks=" + tracks + ", recordLabel=" + recordLabel + ", albumCover="
				+ albumCover + ", albumRating=" + albumRating;
	}
	


}
