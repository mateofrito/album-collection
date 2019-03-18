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
	
	
	
	
	public Song() {}
	
	public Song(String songTitle, String duration) {
		
		this.songTitle = songTitle;
		this.duration = duration;
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
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songTitle=" + songTitle + ", duration=" + duration + "]";
	}
	
	
}
