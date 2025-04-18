package com.RAGA.messageApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("namestay")
    public String sayHello(){
        return "Namestay BridgeLabz";
    }
}
