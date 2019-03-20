package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AlbumComment extends Comment {
	@ManyToOne
	@JsonIgnore
	private Album album;
	
	public AlbumComment() {
	}

	public AlbumComment(String commentContent, Album album) {
		super(commentContent);
	this.album = album;	
	}

	public Album getAlbum() {
		return album;
	}
}
