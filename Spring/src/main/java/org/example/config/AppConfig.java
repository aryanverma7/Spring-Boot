package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration //Added to identify the Java based config files
@ComponentScan("org.example")
public class AppConfig {

//    @Bean(name = {"Beast", "Champ"})
//    @Scope("prototype") It helps create 2 instance of class instead of calling the same class again

//    @Bean
//    public Alien alien(@Qualifier("desktop") Computer com){ It will always refer to the mentioned Qualifier
//    public Alien alien(Computer com){
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
