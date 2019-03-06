package com.training.magang.ecommerce.member.service;

import com.training.magang.ecommerce.member.model.Member;

import java.util.List;

public interface MemberService {

    //    Product create(Product product);
//    Product findById(int id);
//    List<Product> findAll();
//    Product update(Product product);
//    Product delete(int id);

    Member create(Member member);
    Member findById(int id);
    List<Member> findAll();
    Member update(Member member);
    Member delete(int id);


}
