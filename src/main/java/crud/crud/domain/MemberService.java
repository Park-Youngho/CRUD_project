package crud.crud.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //spring bean 등록
@RequiredArgsConstructor //final이 붙은 객체 생성자 주입
public class MemberService {
    private final MemberRepository memberRepository;
    //Create 생성
    public Member createMember(String name, String password){
        Member user = new Member(name, password);
        return memberRepository.save(user);
    }
    //Read 전체조회
    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    //Read 단일조회
    public Member getMember(Long memberId){
        return memberRepository.findById(memberId).orElse(null);
    }
    // Update 수정
    public Member updateMember(Long id, String updateName, String updatePassword){
        Optional<Member> findMember = memberRepository.findById(id);
        if(findMember.isPresent()){
            Member member = findMember.get();
            member.setName(updateName);
            member.setPassword(updatePassword);
            return memberRepository.save(member);
        }
        return null;
    }
    //Delete 삭제
    public void deleteMember(Long deleteMemberId){
        memberRepository.deleteById(deleteMemberId);
    }
}
