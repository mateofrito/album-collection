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
	
	
	public Album() {
		
	}
	
	
	public Album(String albumTitle, String tracks, String recordLabel, String albumCover) {
		
		this.albumTitle = albumTitle;
		this.tracks = tracks;
		this.recordLabel = recordLabel;
		this.albumCover = albumCover;
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
	
	@Override
	public String toString() {
		return "Album [albumTitle=" + albumTitle + ", tracks=" + tracks + ", recordLabel=" + recordLabel
				+ ", albumCover=" + albumCover + "]";
	}

}
