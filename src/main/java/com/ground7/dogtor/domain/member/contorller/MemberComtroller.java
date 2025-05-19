package com.ground7.dogtor.domain.member.contorller;

import org.springframework.web.bind.annotation.GetMapping;

public class MemberComtroller {

    @GetMapping("/hello")
    public String hello(){
        return "jsp/hello";
    }
}
