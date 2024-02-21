package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("21")
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Object Created");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter Called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired //Used to create connection
    @Qualifier("desktop") //gets priority over Primary
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println(age);
        System.out.println("Coding");
        com.compile();
    }
}
