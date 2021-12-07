package hello.hellospring.repository;

import hello.hellospring.domain.Mbti;

import javax.persistence.EntityManager;
import java.util.List;

public class JpaMbtiRepository implements MbtiRepository{

    private final EntityManager em;

    public JpaMbtiRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Mbti write(Mbti mbti) {
        em.persist(mbti);
        return mbti;
    }

    @Override
    public List<Mbti> list() {
        return em.createQuery("select * from Mbti", Mbti.class).getResultList();
    }
}
