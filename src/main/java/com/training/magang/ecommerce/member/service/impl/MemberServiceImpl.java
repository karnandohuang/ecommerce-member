package com.training.magang.ecommerce.member.service.impl;

import com.training.magang.ecommerce.member.model.Member;
import com.training.magang.ecommerce.member.repository.MemberRepository;
import com.training.magang.ecommerce.member.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member create(Member member) {

        memberRepository.save(member);

        return member;
    }

    @Override
    public Member findById(Long id) {

        Optional<Member> optionalMember = memberRepository.findById(id);
        if(optionalMember.isPresent())
            return optionalMember.get();

        return null;
    }

    @Override
    public List<Member> findAll() {

        return memberRepository.findAll();

    }

    @Override
    public Member update(Member member) {

        Member memberData = findById(member.getId());

        BeanUtils.copyProperties(memberData, member);
        memberRepository.save(memberData);

        return memberData;
    }

    @Override
    public Member delete(Long id) {
        Member member = findById(id);

        memberRepository.delete(member);

        return member;
    }
}
