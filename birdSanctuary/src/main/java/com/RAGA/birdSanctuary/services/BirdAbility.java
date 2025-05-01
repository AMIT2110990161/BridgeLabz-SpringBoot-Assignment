package com.RAGA.birdSanctuary.services;

import com.RAGA.birdSanctuary.entity.Bird;
import com.RAGA.birdSanctuary.repositoris.JpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirdAbility {
    @Autowired
    private JpaRepositories jpaRepositories;

    public List<Bird> getAllBirds(){
        List<Bird> li = jpaRepositories.findAll();
        return li;
    }

    public String postBird(Bird entry){
        jpaRepositories.save(entry);
        return "OK!";
    }

    public Bird getByID(int id){
        return jpaRepositories.findById(id).get();
    }

    public Bird deleteByID(int id){
        Bird bird = jpaRepositories.findById(id).get();
        jpaRepositories.deleteById(id);
        return bird;
    }

    public String updateByID(int id, Bird body){
        body.setId(id);
        jpaRepositories.save(body);
        return "Updated!";

    }

    public List<Bird> fly(){
        return jpaRepositories.findByFlyTrue();
    }

    public List<Bird> swim(){
        return jpaRepositories.findBySwimTrue();
    }

    public List<Bird> run(){
        return jpaRepositories.findByRunTrue();
    }

    public List<Bird> flyandswim(){
        return jpaRepositories.findByFlyTrueAndSwimTrueAndRunFalse();
    }

    public List<Bird> flyandrun(){
        return jpaRepositories.findByFlyTrueAndSwimFalseAndRunTrue();
    }

    public List<Bird> swimandrun(){
        return jpaRepositories.findByFlyFalseAndSwimTrueAndRunTrue();
    }
}
