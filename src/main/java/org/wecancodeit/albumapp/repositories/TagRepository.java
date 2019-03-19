package org.wecancodeit.albumapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.albumapp.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
	
}
