
package pl.milo.spotifyplaylist.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "artists",
        "tracks"
})
public class SpotifyAlbum {

    @JsonProperty("artists")
    private Artists artists;
    @JsonProperty("tracks")
    private Tracks tracks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("artists")
    public Artists getArtists() {
        return artists;
    }

    @JsonProperty("artists")
    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    @JsonProperty("tracks")
    public Tracks getTracks() {
        return tracks;
    }

    @JsonProperty("tracks")
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
