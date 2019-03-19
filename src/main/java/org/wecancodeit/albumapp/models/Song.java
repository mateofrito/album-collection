package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long songId;
	private String songTitle;
	private String duration;
	private int songRating;
	
	public Song() {}
	
	public Song(String songTitle, String duration, int songRating) {
		
		this.songTitle = songTitle;
		this.duration = duration;
		this.songRating = songRating;
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
		return "songTitle=" + songTitle + ", duration=" + duration + ", songRating=" + songRating;
	}
}
