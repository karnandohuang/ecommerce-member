package com.training.magang.ecommerce.member.service.impl;

import com.training.magang.ecommerce.member.model.Member;
import com.training.magang.ecommerce.member.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberServiceImpl implements MemberService {

    ArrayList<Member> members = new ArrayList<>();

    @Override
    public Member create(Member member) {

        members.add(member);

        return member;
    }

    @Override
    public Member findById(int id) {

        for (Member member: members) {
            if(member.getId() == id){
                return member;
            }
        }

        return null;
    }

    @Override
    public List<Member> findAll() {
        return members;
    }

    @Override
    public Member update(Member member) {

        for (Member member1: members) {
            if(member1.getId() == member.getId()){
                BeanUtils.copyProperties(member1, member);

                return member1;
            }
        }

        return null;
    }

    @Override
    public Member delete(int id) {
        Member member = findById(id);

        members.remove(member);

        return member;
    }
}
