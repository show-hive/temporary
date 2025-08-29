package com.showhive.member.repository;

import com.showhive.member.domain.Member;

public interface MemberRepository {
    void signUp(Member member);

    Member findById(long memberId);
}
