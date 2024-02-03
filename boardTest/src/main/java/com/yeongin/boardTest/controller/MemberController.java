package com.yeongin.boardTest.controller;

import com.yeongin.boardTest.dto.MemberDTO;
import com.yeongin.boardTest.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class MemberController {
    private final MemberService memberService;

    // 회원가입 페이지
    @GetMapping("/joinPage")
    public String joinPage() {
        return "user/joinPage";
    }

    // 로그인 페이지
    @GetMapping("/loginPage")
    public String loginPage() {
        return "user/loginPage";
    }

    // 회원가입 프로세스
    @PostMapping("/joinProcess")
    public String joinProcess(@ModelAttribute MemberDTO memberDTO) {
        memberService.save(memberDTO);
        return "main";
    }

}
