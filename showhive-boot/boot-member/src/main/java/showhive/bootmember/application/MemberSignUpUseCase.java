package showhive.bootmember.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import showhive.bootmember.application.command.MemberSignUpCommand;
import showhive.data.member.domain.Member;
import showhive.data.member.repository.MemberRepository;

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
