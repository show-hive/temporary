package showhive.infrapersistence.member;

import org.springframework.data.jpa.repository.JpaRepository;
import showhive.data.member.domain.Member;

public interface JpaMemberRepository extends JpaRepository<Member, Long> {
}
