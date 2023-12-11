package ra.academy.service;

import ra.academy.model.FormRequest;
import ra.academy.model.Music;

import java.util.List;

public interface ISongService {
    List<Music> findAll();

    Music findById(Long id);

    void save(FormRequest customer);

    void remove(Long id);
}
