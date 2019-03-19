package org.wecancodeit.albumapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.albumapp.models.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
