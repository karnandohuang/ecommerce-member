package com.training.magang.ecommerce.member.controller;

import com.training.magang.ecommerce.member.model.ApiKey;
import com.training.magang.ecommerce.member.model.Member;
import com.training.magang.ecommerce.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(
            value = "/members",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Member create(@RequestBody Member member){
        return memberService.create(member);
    }

    @RequestMapping(
            value = "/members/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Member findById(@PathVariable("id") Long id){
        return memberService.findById(id);
    }

    @RequestMapping(
            value = "/members",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Member> findAll(){
        return memberService.findAll();
    }

    @RequestMapping(
            value = "/members",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Member update(@RequestBody Member member){
        return memberService.update(member);
    }

    @RequestMapping(
            value = "/members/{id}",
            method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Member delete(@PathVariable("id") Long id){

        return memberService.delete(id);
    }

    @RequestMapping(
            value = "/hello",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String hello(ApiKey apiKey){
        return "Hello World";
    }

}
