package ra.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.academy.model.FormRequest;
import ra.academy.model.Music;
import ra.academy.repository.ISongRepository;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {
    @Autowired
    ISongRepository SongRepository;
    @Autowired
    UploadService uploadService;

    @Override
    public List<Music> findAll() {
        return null;
    }

    @Override
    public Music findById(Long id) {
        return null;
    }

    @Override
    public void save(FormRequest music) {
        SongRepository.save(new Music(music.getSongName(),
                music.getType(), music.getSinger(),
                uploadService.uploadFile(music.getUrl()))
        );
    }

    @Override
    public void remove(Long id) {

    }
}
