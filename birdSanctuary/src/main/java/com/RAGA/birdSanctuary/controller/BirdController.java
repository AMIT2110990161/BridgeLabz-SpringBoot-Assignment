package com.RAGA.birdSanctuary.controller;

import com.RAGA.birdSanctuary.entity.Bird;
import com.RAGA.birdSanctuary.services.BirdAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/birds")
public class BirdController {
    @Autowired
    private BirdAbility birdAbility;

    @GetMapping()
    public List<Bird> getAllBirds(){
        return birdAbility.getAllBirds();
    }

    @PostMapping()
    public String postBirds(@RequestBody Bird entry){
        return birdAbility.postBird(entry);
    }

    @GetMapping("id/{id}")
    public Bird getByID(@PathVariable int id){
        return birdAbility.getByID(id);
    }

    @PostMapping("id/{id}")
    public String updateByID(@PathVariable int id, @RequestBody Bird body){
        return birdAbility.updateByID(id, body);
    }

    @DeleteMapping("id/{id}")
    public Bird deleteByID(@PathVariable int id){
        return birdAbility.deleteByID(id);
    }

    @GetMapping("/fly")
    public List<Bird> fly(){
        return birdAbility.fly();
    }

    @GetMapping("/swim")
    public List<Bird> swim(){
        return birdAbility.swim();
    }

    @GetMapping("/run")
    public List<Bird> run(){
        return birdAbility.run();
    }

    @GetMapping("/flyandswim")
    public List<Bird> flyandswim(){
        return birdAbility.flyandswim();
    }

    @GetMapping("/flyandrun")
    public List<Bird> flyandrun(){
        return birdAbility.flyandrun();
    }

    @GetMapping("/swimandrun")
    public List<Bird> swimandrun(){
        return birdAbility.swimandrun();
    }
}
