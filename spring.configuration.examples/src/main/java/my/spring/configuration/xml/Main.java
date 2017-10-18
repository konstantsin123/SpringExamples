package my.spring.configuration.xml;

import my.spring.beans.xml.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Bean1 bean1 =(Bean1) applicationContext.getBean("bean1");
        System.out.println(bean1.name);
    }


}
