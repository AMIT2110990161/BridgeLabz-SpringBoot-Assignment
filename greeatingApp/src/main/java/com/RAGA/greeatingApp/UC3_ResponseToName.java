package com.RAGA.greeatingApp;

import com.RAGA.greeatingApp.utility.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UC3_ResponseToName {
    @PostMapping("/userGreeating")
    public String response(@RequestBody Person person){
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        if(firstName != null && lastName != null){
            return "Hey " + firstName + " " + lastName + ", BridgeLabz mai apka shugat hai";
        }else if(firstName != null){
            return "Hey " + firstName + ", BridgeLabz mai apka shugat hai";
        }else if(lastName != null){
            return "Hey " + lastName + ", BridgeLabz mai apka shugat hai";
        }else{
            return "Namestay duniya";
        }
    }
}
