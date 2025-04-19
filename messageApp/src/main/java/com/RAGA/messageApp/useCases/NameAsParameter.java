package com.RAGA.messageApp.useCases;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class NameAsParameter {
    @GetMapping("/value")
    public String getName(@RequestParam String name){
        return "Hello " + name + " Bridgelabz mai apka shugat hai";
    }
}
