package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //("Beast") Can mention the name
@Scope("prototype")
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop Object Created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
