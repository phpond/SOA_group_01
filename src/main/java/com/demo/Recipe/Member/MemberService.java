package com.demo.Recipe.Member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private Member member;

    public String addMember(String memberId){
        return "addMember";
    }

    public Member getMember(String memberId){
        return member;
    }

}
