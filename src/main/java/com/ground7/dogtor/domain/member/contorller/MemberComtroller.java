package com.ground7.dogtor.domain.member.contorller;

import com.ground7.dogtor.domain.member.dto.MemberSignUpRequest;
import com.ground7.dogtor.domain.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/member")
public class MemberComtroller {

    @Autowired
    MemberService memberService;

    @PostMapping("/signup")
    public String signUp(HttpServletRequest httpServletRequest, @ModelAttribute MemberSignUpRequest memberSignbUpRequest){

        memberService.signUp(memberSignbUpRequest);

        return "jsp/signUp";
    }

    @GetMapping("/hello")
    public String hello() {
        return "jsp/hello";
    }
}
