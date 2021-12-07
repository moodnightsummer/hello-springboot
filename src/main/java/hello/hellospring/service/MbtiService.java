package hello.hellospring.service;

import hello.hellospring.domain.Mbti;
import hello.hellospring.repository.MbtiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MbtiService {

    private MbtiRepository mbtiRepository;

    @Autowired
    public MbtiService(MbtiRepository mbtiRepository){
        this.mbtiRepository = mbtiRepository;
    }

    public Long join(Mbti mbti){ // 작성 완료


        mbtiRepository.write(mbti);
        return mbti.getNo();
    }

    public List<Mbti> findMbti(){
        return mbtiRepository.list();
    }







}
