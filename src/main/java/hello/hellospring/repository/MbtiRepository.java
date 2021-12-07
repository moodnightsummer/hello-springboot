package hello.hellospring.repository;

import hello.hellospring.domain.Mbti;

import java.util.List;

public interface MbtiRepository {
    Mbti write(Mbti mbti);
    List<Mbti> list();

}
