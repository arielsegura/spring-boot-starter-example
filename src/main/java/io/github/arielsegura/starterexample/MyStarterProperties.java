package io.github.arielsegura.starterexample;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my-starter")
@Getter
@Setter
public class MyStarterProperties {
    private String phrase = "Hello World!";
}
