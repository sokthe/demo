package com.example.demo.Controller;


import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;

    }

@GetMapping("MemberForm")
    public String createForm(Model model){
        model.addAttribute("memberForm", new MemberForm());
        return"MemberForm";
}

@PostMapping("/members/new")
    public String create(MemberForm form){
    Member member = new Member();
    member.setName(form.getName());

    memberService.join(member);
    return "rederect:/";
}

@GetMapping("/memberList")
    public String list(Model model){
    List<Member> members = memberService.findMembers();
    model.addAttribute("members", members);

    return "memberList";
}

}
