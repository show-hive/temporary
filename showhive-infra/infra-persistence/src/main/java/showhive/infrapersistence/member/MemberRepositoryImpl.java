package showhive.infrapersistence.member;

import org.springframework.stereotype.Repository;
import showhive.datamember.domain.Member;
import showhive.datamember.domain.MemberRepository;

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

}
