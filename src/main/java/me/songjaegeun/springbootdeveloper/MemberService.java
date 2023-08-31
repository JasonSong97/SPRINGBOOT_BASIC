package me.songjaegeun.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void test() {
        memberRepository.save(new Member(1L, "A"));

        Optional<Member> members = memberRepository.findById(1L);
        List<Member> allMembers = memberRepository.findAll();

        memberRepository.deleteById(1L);
    }
}
