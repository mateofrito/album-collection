package org.wecancodeit.albumapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.albumapp.models.Song;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{

}
