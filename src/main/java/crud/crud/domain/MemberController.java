package crud.crud.domain;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor //생성자 자동 주입
@RequestMapping("/members")
@ResponseBody
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public Member createMember(@RequestBody Member member){
        return memberService.createMember(member.getName(), member.getPassword());
    }

    @GetMapping
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @GetMapping("/{memberId}")
    public Member getMember(@PathVariable Long memberId){
        return memberService.getMember(memberId);
    }

    @PutMapping("/{memberId}")
    public Member updateMember(@PathVariable Long memberId, @RequestBody Member member){
        return memberService.updateMember(memberId, member.getName(), member.getPassword());
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId){
        memberService.deleteMember(memberId);
    }

}
