package my.spring.configuration.annotaions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "my.spring")
public class AppConfig {

}