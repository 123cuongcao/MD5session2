package ra.academy.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

public class FormRequest {
    private String songName;
    private MusicType type;

    private String singer;

    private MultipartFile url;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
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



    public FormRequest() {
    }

    public MultipartFile getUrl() {
        return url;
    }

    public void setUrl(MultipartFile url) {
        this.url = url;
    }

    public FormRequest(String songName, MusicType type, String singer, MultipartFile url) {
        this.songName = songName;
        this.type = type;
        this.singer = singer;
        this.url = url;
    }
}
