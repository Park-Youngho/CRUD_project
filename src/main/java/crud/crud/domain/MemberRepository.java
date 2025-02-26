package crud.crud.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //spring bean 등록
public interface MemberRepository extends JpaRepository<Member, Long>{
    //JpaRepository를 상속받으면 CRUD를 별도의 선언없이 사용이 가능하다.
}
