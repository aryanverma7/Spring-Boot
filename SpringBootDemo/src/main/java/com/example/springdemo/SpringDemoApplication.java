package com.example.springdemo;

import com.example.springdemo.module.Laptop;
import com.example.springdemo.service.LaptopService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);

//        Alien obj = context.getBean(Alien.class);
//        System.out.println(obj.getAge());
//        obj.code();

    }

}
