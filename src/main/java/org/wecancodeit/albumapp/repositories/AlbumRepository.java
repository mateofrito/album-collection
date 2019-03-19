package org.wecancodeit.albumapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.albumapp.models.Album;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long>{
	
	Album findByAlbumTitle(String albumTitle);
	

}
