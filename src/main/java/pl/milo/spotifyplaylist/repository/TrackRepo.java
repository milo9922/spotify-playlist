package pl.milo.spotifyplaylist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.milo.spotifyplaylist.entity.Track;

@Repository
public interface TrackRepo extends MongoRepository<Track, String> {
}
