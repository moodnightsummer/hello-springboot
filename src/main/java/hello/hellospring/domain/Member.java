package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 생성되는 것 (id가 넘버로 알아서 생김)
    private Long id;
    //@Column(name="username") 컬럼명과 맵핑을 해 줌
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }
}
