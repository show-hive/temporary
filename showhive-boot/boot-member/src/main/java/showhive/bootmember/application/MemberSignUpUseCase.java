package showhive.bootmember.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import showhive.bootmember.application.command.MemberSignUpCommand;
import showhive.datamember.domain.Member;
import showhive.datamember.domain.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberSignUpUseCase {

    private final MemberRepository memberRepository;
    
    public void signUp(MemberSignUpCommand command) {
        Member member = Member.create(command.name());
//        Member member = command.toDomain();
        memberRepository.signUp(member);
    }
}
