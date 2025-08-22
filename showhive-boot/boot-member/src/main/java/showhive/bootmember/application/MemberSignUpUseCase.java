package showhive.bootmember.application;

import org.springframework.stereotype.Service;
import showhive.bootmember.application.command.MemberSignUpCommand;
import showhive.datamember.domain.Member;
import showhive.datamember.domain.MemberRepository;

@Service
public class MemberSignUpUseCase {

    private final MemberRepository memberRepository;

    public MemberSignUpUseCase(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void signUp(MemberSignUpCommand command) {
        Member member = Member.create(command.name());
//        Member member = command.toDomain();
        memberRepository.signUp(member);
    }
}
