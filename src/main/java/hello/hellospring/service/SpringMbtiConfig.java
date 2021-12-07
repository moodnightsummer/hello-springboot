package hello.hellospring.service;

import hello.hellospring.repository.MbtiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringMbtiConfig {
    private final MbtiRepository mbtiRepository;

    @Autowired
    public SpringMbtiConfig(MbtiRepository mbtiRepository){
        this.mbtiRepository = mbtiRepository;
    }
}
