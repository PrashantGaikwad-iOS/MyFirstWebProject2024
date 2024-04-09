package org.example.prashant.myfirstwebproject2024;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintHello {
    @RequestMapping("/hello/{name}")
    public String printHello(@PathVariable("name") String name) {
        return "Hello " + name + "!";
    }
    @RequestMapping("/bye/{name}")
    public String printBye(@PathVariable("name") String name) {
        return "Bye " + name + ".";
    }
}
