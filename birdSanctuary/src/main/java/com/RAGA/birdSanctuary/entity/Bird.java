package com.RAGA.birdSanctuary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Bird {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private boolean fly;
    private boolean swim;
    private boolean run;
}
