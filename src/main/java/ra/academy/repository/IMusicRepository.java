package ra.academy.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.academy.model.Music;

import java.awt.print.Pageable;
@Repository
public interface IMusicRepository extends PagingAndSortingRepository<Music,Long> {
    Page<Music> findMusicBySongNameContaining(String name , Pageable pageable);

}
