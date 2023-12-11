package ra.academy.model;

import javax.persistence.*;

@Entity
@Table
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "song_name")
    private String songName;
    @Column(name = "music_type")
    @Enumerated(EnumType.STRING)
    private MusicType type;
    @Column(name = "singer_name")
    private String singer;
    @Column(name = "song_url")
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MusicType getType() {
        return type;
    }

    public void setType(MusicType type) {
        this.type = type;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Music() {
    }

    public Music(String songName, MusicType type, String singer, String url) {
        this.songName = songName;
        this.type = type;
        this.singer = singer;
        this.url = url;
    }
}
