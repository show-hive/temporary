package showhive.bootmember.apis.dto;

import showhive.bootmember.application.command.MemberSignUpCommand;

public record MemberSignUpRequest(String name) {
    public MemberSignUpCommand toCommand() {
        return new MemberSignUpCommand(name);
    }
}
