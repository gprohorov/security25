package edu.pzks.security25.config;


/*
  @author   george
  @project   security25
  @class  AuditionConfiguration
  @version  1.0.0 
  @since 27.03.25 - 08.09
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@Configuration
public class AuditionConfiguration {

    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }


}
