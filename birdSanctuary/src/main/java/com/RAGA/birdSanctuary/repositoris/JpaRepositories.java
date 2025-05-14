package com.RAGA.birdSanctuary.repositoris;

import com.RAGA.birdSanctuary.entity.Bird;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JpaRepositories extends JpaRepository<Bird, Integer> {
    List<Bird> findByFlyTrueAndSwimTrueAndRunTrue();
    List<Bird> findByFlyTrueAndSwimTrueAndRunFalse();
    List<Bird> findByFlyTrueAndSwimFalseAndRunTrue();
    List<Bird> findByFlyFalseAndSwimTrueAndRunTrue();
    List<Bird> findByFlyTrue();
    List<Bird> findBySwimTrue();
    List<Bird> findByRunTrue();
//    @Query("SELECT b FROM Bird b WHERE b.name = 'Duck'")
//    List<Bird> findByNameDuck();
    List<Bird> findByName(String name);
    @Query("SELECT b.id FROM Bird b")
    List<Integer> findAllId();

}
