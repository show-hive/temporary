package showhive.bootmember.application;

import org.springframework.stereotype.Service;
import showhive.bootmember.apis.dto.MemberResponse;
import showhive.datamember.domain.Member;
import showhive.datamember.domain.MemberRepository;

@Service
public class MemberFindUseCase {

    private final MemberRepository memberRepository;

    public MemberFindUseCase(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberResponse findMember(long memberId) {
        Member member = memberRepository.findById(memberId);
        return MemberResponse.from(member);
    }
}
