package com.yeongin.boardTest.repository;

import com.yeongin.boardTest.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
