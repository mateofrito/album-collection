package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ArtistComment extends Comment {
	@ManyToOne
	private Artist artist;
	
	public ArtistComment() {
	}

	public ArtistComment(String commentContent, Artist artist) {
		super(commentContent);
	this.artist = artist;	
	}

	public Artist getArtist() {
		return artist;
	}

}

