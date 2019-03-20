package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SongComment extends Comment {
	@ManyToOne
	@JsonIgnore
	private Song song;
	
	public SongComment() {
	}

	public SongComment(String commentContent, Song song) {
		super(commentContent);
	this.song = song;	
	}

	public Song getSong() {
		return song;
	}
}
