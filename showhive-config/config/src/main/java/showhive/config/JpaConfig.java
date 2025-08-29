package showhive.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "showhive.infrapersistence")
@EntityScan(basePackages = "showhive.data")
@EnableJpaAuditing
public class JpaConfig {
}


