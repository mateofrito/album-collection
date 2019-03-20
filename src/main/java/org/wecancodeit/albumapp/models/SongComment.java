package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SongComment extends Comment {
	@ManyToOne
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
