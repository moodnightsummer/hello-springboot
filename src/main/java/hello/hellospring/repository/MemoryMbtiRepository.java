package hello.hellospring.repository;


import hello.hellospring.domain.Mbti;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemoryMbtiRepository implements MbtiRepository {

    private Map<Long, Mbti> store = new HashMap<>();

    @Override
    public Mbti write(Mbti mbti) {
        store.put(mbti.getNo(), mbti);
        return mbti;
    }

    @Override
    public List<Mbti> list() {
        return new ArrayList<>(store.values());
    }
}
