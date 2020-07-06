package pl.milo.spotifyplaylist.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Track {

    @Id
    private String id;
    private String trackName;

}
