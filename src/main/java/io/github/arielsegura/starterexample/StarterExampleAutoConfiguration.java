package io.github.arielsegura.starterexample;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "logging.api.enabled", havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties(MyStarterProperties.class)
public class StarterExampleAutoConfiguration {

    @Bean
    public FilterRegistrationBean requestDumperFilter(MyStarterProperties myStarterProperties) {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyAwesomeFilter(myStarterProperties.getPhrase()));
        return registration;
    }

}
