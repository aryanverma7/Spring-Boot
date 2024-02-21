package org.example;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        Java Based Config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt = context.getBean("Beast", Desktop.class);
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();

        Alien obj = (Alien) context.getBean(Alien.class);
        obj.code();

//        XML
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();
//        System.out.println(obj.getAge());
    }
}
