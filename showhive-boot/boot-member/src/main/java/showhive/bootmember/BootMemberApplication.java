package showhive.bootmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import showhive.datamember.domain.Member;
import org.springframework.transaction.annotation.*;
import showhive.infrapersistence.member.JpaMemberRepository;

@SpringBootApplication(
        // 컴포넌트 스캔: showhive 전체 하위 패키지 스캔 (Controller/Service 등)
        scanBasePackages = "showhive"
)
@EnableTransactionManagement                   // @Transactional 활성화
@EnableJpaAuditing                               // @CreatedDate, @LastModifiedDate 등 감사 필드 자동 설정
@EntityScan(basePackageClasses = {               // 엔티티 스캔(문자열 대신 클래스 기준 권장)
        Member.class
})
@EnableJpaRepositories(basePackageClasses = {    // 스프링데이터 JPA 리포 스캔
        JpaMemberRepository.class
})public class BootMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMemberApplication.class, args);
    }

}
