package com.ground7.dogtor.domain.member.contorller;

import com.ground7.dogtor.domain.member.dto.MemberSignUpRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberComtroller {

    @PostMapping("/login")
    signUp(HttpServletRequest httpServletRequest, @ModelAttribute MemberSignUpRequest memberSignbUpRequest){

        memberService.login(memberSignbUpRequest);

    }
}
