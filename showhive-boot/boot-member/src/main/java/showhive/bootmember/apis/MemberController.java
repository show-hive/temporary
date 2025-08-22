package showhive.bootmember.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import showhive.bootmember.apis.dto.MemberSignUpRequest;
import showhive.bootmember.application.MemberSignUpUseCase;

@RestController
@RequestMapping("member")
public class MemberController {

    private final MemberSignUpUseCase memberSignUpUseCase;

    public MemberController(MemberSignUpUseCase memberSignUpUseCase) {
        this.memberSignUpUseCase = memberSignUpUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> createMember(MemberSignUpRequest request) {
        memberSignUpUseCase.signUp(request.toCommand());
        return ResponseEntity.ok().build();
    }
}
