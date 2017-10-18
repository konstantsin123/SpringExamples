package my.spring.configuration.annotaions;

import my.spring.beans.annotation.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan(basePackages = "my.spring")
public class Main {

//    fail - Main is not a component
//    @Autowired
//    public static Bean1 bean1;

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        MyService myService = (MyService) context.getBean("myservice");
        myService.a1printlnBean();
        //or
        Bean1 bean1 = (Bean1) context.getBean("mybean");
        System.out.println(bean1.name);
    }
}