package com.RAGA.messageApp.useCases;

import com.RAGA.messageApp.components.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PostName {
    @PostMapping("/data")
    public String sayHello(@RequestBody Person person){
        return "Hello " + person.getFirstName() + " " + person.getLastName() + " !";
    }

    // putName
    @PutMapping("/put/{firstName}")
    public String hello(@PathVariable String firstName, @RequestParam String lastName){
        return "Hey " + firstName + " " + lastName;
    }
}
