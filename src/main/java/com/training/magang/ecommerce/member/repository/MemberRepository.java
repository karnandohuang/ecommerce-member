package com.training.magang.ecommerce.member.repository;

import com.training.magang.ecommerce.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
