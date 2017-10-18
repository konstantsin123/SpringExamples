package my.spring.configuration.annotaions;

import my.spring.beans.annotation.Bean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Service;

@Service("myservice")
public class MyService {

    @Autowired
    public Bean1 bean1;

//    public void a1printlnBean(AbstractApplicationContext context){
//        Bean1 bean1 =  (Bean1) context.getBean("Bean1");
//        System.out.println(bean1.name);
//    }
//    public void a1printlnBean(Bean1 bean1){
//        System.out.println(bean1.name);
//    }

    public void a1printlnBean(){
        System.out.println(bean1.name);
    }
}
