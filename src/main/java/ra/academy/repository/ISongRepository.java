package ra.academy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ra.academy.model.Music;

import java.util.List;

public interface ISongRepository  {
    List<Music> findAll();

    Music findById(Long id);

    void save(Music music);

    void remove(Long id);


}
