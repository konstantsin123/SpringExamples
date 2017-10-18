package my.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebMVCAnnotaion {

    @RequestMapping(value = "/web")
    public String index1() {
        return "index1";
    }
}
