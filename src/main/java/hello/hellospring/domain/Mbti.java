package hello.hellospring.domain;


import javax.persistence.*;

@Entity
public class Mbti {
    @Id
    private Long no;
    private String name;

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
