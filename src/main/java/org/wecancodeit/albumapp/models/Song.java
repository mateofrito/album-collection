package org.wecancodeit.albumapp.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long songId;
	private String songTitle;
	private String duration;
	private int songRating;
	@ManyToOne
	@JsonIgnore
	private Album album;
	@OneToMany(mappedBy = "song")
	private Collection<SongComment> songComments;

	public Song() {
	}

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

	public Collection<SongComment> getSongComments() {
		return songComments;
	}

	public int getSongRating() {
		return songRating;
	}
	
	public Album getAlbum() {
		return album;
	}

	@Override
	public String toString() {
		return "Song [songTitle=" + songTitle + ", duration=" + duration + ", songRating=" + songRating + ", album="
				+ album + "]";
	}
}
