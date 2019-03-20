package org.wecancodeit.albumapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Comment {
	@Id
	@GeneratedValue
	private Long commentId;

	private String commentContent;

	public Comment() {
	}

	public Comment(String commentContent) {
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
		return "Comment [commentContent=" + commentContent + "]";
	}

}
