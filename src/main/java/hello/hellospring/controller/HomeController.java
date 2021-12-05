package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // 로컬호스트 8080 들어가면 여기를 바로 탐
    public String home(){
        return "home";
    }
}
