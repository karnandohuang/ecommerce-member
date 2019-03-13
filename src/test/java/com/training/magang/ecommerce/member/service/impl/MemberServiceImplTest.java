//package com.training.magang.ecommerce.member.service.impl;
//
//import com.training.magang.ecommerce.member.model.Member;
//import com.training.magang.ecommerce.member.service.MemberService;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MemberServiceImplTest {
//
//    @Autowired
//    private MemberService memberService;
//
//    @Test
//    public void createMemberTest() {
//        Member member = new Member();
//        member.setName("Karnando");
//        member.setAddress("Rumah");
//
//        memberService.create(member);
//
//        Assert.assertTrue(memberService.findAll().size() == 1);
//    }
//
//    @Test
//    public void findMemberByIdTest() {
//
//        Member member = new Member();
//        member.setName("Karnando");
//        member.setAddress("Rumah");
//
//        memberService.create(member);
//
//        Assert.assertTrue(memberService.findById(1L).equals(member));
//
//    }
//
//    @Test
//    public void findAllMemberTest() {
//
//        Member member1 = new Member();
//        member1.setName("Karnando");
//        member1.setAddress("Rumah");
//        memberService.create(member1);
//
//        Member member2 = new Member();
//        member2.setName("Sepryan");
//        member2.setAddress("Home");
//        memberService.create(member2);
//
//
//        List<Member> memberList = new ArrayList<>();
//        memberList.add(member1);
//        memberList.add(member2);
//
//        Assert.assertEquals(memberService.findAll(), memberList);
//
//    }
//
//    @Test
//    public void updateMemberTest() {
//
//        Member member = new Member();
//        member.setName("Karnando");
//        member.setAddress("Rumah");
//
//        memberService.create(member);
//
//        Assert.assertEquals(memberService.findById(1L), member);
//
//        member.setId(1L);
//        member.setName("Sepryan");
//        member.setAddress("Home");
//        memberService.update(member);
//
//        Assert.assertEquals(memberService.findById(1L), member);
//
//    }
//
//    @Test
//    public void deleteMemberTest() {
//
//        Member member = new Member();
//        member.setName("Karnando");
//        member.setAddress("Rumah");
//
//        memberService.create(member);
//
//        Assert.assertEquals(memberService.findById(1L), member);
//
//        memberService.delete(1L);
//        Assert.assertEquals(memberService.findById(1L), null);
//        Assert.assertTrue(memberService.findAll().size() == 0);
//
//
//    }
//}