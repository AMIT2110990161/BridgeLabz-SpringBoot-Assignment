package com.RAGA.birdSanctuary.controller;

import com.RAGA.birdSanctuary.entity.Bird;
import com.RAGA.birdSanctuary.services.BirdAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getByID(@PathVariable int id){
        try {
            Bird byID = birdAbility.getByID(id);
            return ResponseEntity.ok(byID);
        }catch (Exception ex){

            return  new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
        }
//        Bird bird =  birdAbility.getByID(id);
//        if(bird == null){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(birdAbility.getAllID());
//        }
//        return ResponseEntity.ok(bird);
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

    @GetMapping("/fly-swim-run")
    public List<Bird> flySwimRun(){
        return birdAbility.flySwimRun();
    }

    @GetMapping("/getByName/{name}")
    public List<Bird> findByName(@PathVariable String name){
        return birdAbility.findByName(name);
    }
}
