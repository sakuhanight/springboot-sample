package net.tsuitachi.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringbootSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSampleApplication.class, args);
    }

}

@Controller
class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello, World!";
    }

}