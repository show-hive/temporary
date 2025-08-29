package showhive.bootmember.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import showhive.config.JpaConfig;

@Configuration
@Import(JpaConfig.class)
public class AppConfig {
}
