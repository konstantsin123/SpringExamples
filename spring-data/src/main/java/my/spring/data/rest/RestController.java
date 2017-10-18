package my.spring.data.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RestController {

    @RequestMapping("/data")
    public String hi() {
        return "Hi, here data from database!";
    }
}
