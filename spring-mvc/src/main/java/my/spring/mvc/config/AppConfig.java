package my.spring.mvc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"my.spring.mvc.*"})
public class AppConfig {
}
