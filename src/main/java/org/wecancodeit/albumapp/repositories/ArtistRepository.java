package org.wecancodeit.albumapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.albumapp.models.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long>{

	Artist findByArtistName(String artistName);

	
	
}
