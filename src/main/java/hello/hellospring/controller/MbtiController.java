package hello.hellospring.controller;

import hello.hellospring.domain.Mbti;
import hello.hellospring.service.MbtiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MbtiController {

    private final MbtiService mbtiService;

    @Autowired
    public MbtiController(MbtiService mbtiService){
        this.mbtiService=mbtiService;
    }

    @GetMapping("/")
    public String homePage(){
        return "mbti";
    }

    @GetMapping("/mbti/upset")
    public String createForm(){
        return "mbti/write";
    }

    @PostMapping("/mbti/signup")
    public String singUp(MbtiForm form){
        Mbti mbti = new Mbti();
        System.out.println(form.getName()+" "+form.getNo());
        mbti.setNo(form.getNo());
        mbti.setName(form.getName());
        mbtiService.join(mbti);
        return "redirect:/";
    }

    @GetMapping("/mbti/lists")
    public String listUp(Model model){
        List<Mbti> mbtis = mbtiService.findMbti();
        System.out.println(mbtis);
        model.addAttribute("list", mbtis);
        return "mbti/list";
    }
}
