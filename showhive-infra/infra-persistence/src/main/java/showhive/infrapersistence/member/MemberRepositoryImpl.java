package showhive.infrapersistence.member;

import org.springframework.stereotype.Repository;
import showhive.data.member.domain.Member;
import showhive.data.member.repository.MemberRepository;

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
                .orElseThrow(() -> new RuntimeException("존재하지 않는 회원입니다."));
    }
}
