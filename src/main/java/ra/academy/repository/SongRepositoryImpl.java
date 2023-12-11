package ra.academy.repository;

import org.springframework.stereotype.Repository;
import ra.academy.model.Music;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SongRepositoryImpl implements ISongRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query = entityManager.createQuery("select m from Music m", Music.class);
        return query.getResultList();
    }

    @Override
    public Music findById(Long id) {
        TypedQuery<Music> query = entityManager.createQuery("select m from Music m where  m.id=:id", Music.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Music music) {
        if (findById(music.getId()) != null) {
            entityManager.merge(music);
        } else {
            entityManager.persist(music);
        }
    }

    @Override
    public void remove(Long id) {
        Music music = findById(id);
        if (music != null) {
            entityManager.remove(music);
        }
    }
}
