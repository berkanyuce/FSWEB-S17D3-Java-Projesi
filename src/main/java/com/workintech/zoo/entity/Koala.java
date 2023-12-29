package com.workintech.zoo.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Koala {
    private Integer id;
    private String name;
    private Double weight;
    private Double sleepHour;
    private String gender;
}
