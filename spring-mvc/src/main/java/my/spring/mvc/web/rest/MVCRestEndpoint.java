package my.spring.mvc.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MVCRestEndpoint {

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public String hello() {
        return "Hi, its easy, isn't it?";
    }
}
