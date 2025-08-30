package com.showhive.member;

import com.showhive.exception.member.MemberErrorCode;
import com.showhive.exception.member.MemberException;
import org.springframework.stereotype.Repository;
import com.showhive.member.domain.Member;
import com.showhive.member.repository.MemberRepository;

@Repository
public class MemberRepositoryImpl implements MemberRepository {

    private final JpaMemberRepository jpaMemberRepository;

    public MemberRepositoryImpl(JpaMemberRepository jpaMemberRepository) {
        this.jpaMemberRepository = jpaMemberRepository;
    }

    @Override
    public void signUp(Member member) {
        jpaMemberRepository.save(member);
    }

    @Override
    public Member findById(long memberId) {
        return jpaMemberRepository.findById(memberId)
                .orElseThrow(() -> new MemberException(MemberErrorCode.MEMBER_NOT_FOUND));
    }
}
