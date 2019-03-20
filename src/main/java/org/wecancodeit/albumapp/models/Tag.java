package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long tagId;
	private String tagName;
//	private Artist artist;
//	private Song song;
//	private Album album;
//	
	public Tag() {}
	
	public Tag(String tagName) {
		this.tagName = tagName;
	}
	
	public Long getTagId() {
		return tagId;
	}
	public String getTagName() {
		return tagName;
	}
	@Override
	public String toString() {
		return "tagName=" + tagName;
	}

}
