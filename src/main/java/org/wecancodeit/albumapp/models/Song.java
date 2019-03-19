package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long songId;
	private String songTitle;
	private String duration;
	private int songRating;
	@ManyToOne
	private Album album;
	
	public Album getAlbum() {
		return album;
	}

	public Song() {}
	
	public Song(String songTitle, String duration, int songRating, Album album) {
		this.songTitle = songTitle;
		this.duration = duration;
		this.songRating = songRating;
		this.album = album;
	}
	
	
	public Long getSongId() {
		return songId;
	}
	public String getSongTitle() {
		return songTitle;
	}
	public String getDuration() {
		return duration;
	}
	public int getSongRating() {
		return songRating;
	}
	@Override
	public String toString() {
		return "Song [songTitle=" + songTitle + ", duration=" + duration + ", songRating=" + songRating + ", album="
				+ album + "]";
	}
}
