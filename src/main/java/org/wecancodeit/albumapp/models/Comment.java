package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {

	
	@Id
	@GeneratedValue
	private Long commentId;
	private String commentContent;
//	private Artist artist;
//	private Song song;
//	private Album album;

	

	public Comment() {}
	
	public Comment(Long commentId, String commentContent) {
		this.commentContent = commentContent;
	}
	
	
	public Long getCommentId() {
		return commentId;
	}
	public String getCommentContent() {
		return commentContent;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentContent=" + commentContent + "]";
	}
	
	
}
