package com.example.springdemo.repo;

import com.example.springdemo.module.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database");
    }
}
