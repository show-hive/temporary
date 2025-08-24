package showhive.bootmember.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import showhive.bootmember.apis.dto.MemberResponse;
import showhive.datamember.domain.Member;
import showhive.datamember.domain.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberFindUseCase {

    private final MemberRepository memberRepository;

    public MemberResponse findMember(long memberId) {
        Member member = memberRepository.findById(memberId);
        return MemberResponse.from(member);
    }
}
