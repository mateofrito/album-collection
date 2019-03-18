package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long songId;
	private String title;
	private String duration;
	
	
	
	
	public Song() {}
	
	public Song(String title, String duration) {
		
		this.title = title;
		this.duration = duration;
	}
	public Long getSongId() {
		return songId;
	}
	public String getTitle() {
		return title;
	}
	public String getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", title=" + title + ", duration=" + duration + "]";
	}
	
	
}
