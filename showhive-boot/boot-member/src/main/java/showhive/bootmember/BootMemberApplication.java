package showhive.bootmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import showhive.config.CommonJpaConfig;

@SpringBootApplication(scanBasePackages = "showhive")
@Import(CommonJpaConfig.class)
public class BootMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMemberApplication.class, args);
    }
}
