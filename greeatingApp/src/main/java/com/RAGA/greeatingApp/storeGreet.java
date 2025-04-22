package com.RAGA.greeatingApp;

import com.RAGA.greeatingApp.utility.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class storeGreet {
    private Map<Integer, Greeting> hm = new HashMap<>();

    @GetMapping
    public List<Greeting> getAll(){
        return new ArrayList<>(hm.values());
    }

    @PostMapping
    public String postAll(@RequestBody Greeting greet){
        hm.put(greet.getId(), greet);
        return "Done!";
    }

    @GetMapping("id/{id}")
    public Greeting getById(@PathVariable int id){
        return hm.get(id);
    }

    @DeleteMapping("id/{id}")
    public Greeting deleteById(@PathVariable int id){
        return hm.remove(id);

    }

    @PutMapping("id/{id}")
    public String putById(@PathVariable int id, @RequestBody Greeting greet){
        if(!hm.containsKey(id)) return "this ID is not present in dataSet" ;
        hm.put(id, greet);
        return "Data of ID " + id + " is changed successful!";
    }
}
