package showhive.data.member.repository;

import showhive.data.member.domain.Member;

public interface MemberRepository {
    void signUp(Member member);

    Member findById(long memberId);
}
