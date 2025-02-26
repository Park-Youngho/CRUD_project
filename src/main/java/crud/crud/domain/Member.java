package crud.crud.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
    //(PK) 설정
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // id값 자동 증가
    private Long id;

    private String name;
    private String password;

    //jpa를 사용하기 위한 기본생성자
    public Member(){
    }

    public Member(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
