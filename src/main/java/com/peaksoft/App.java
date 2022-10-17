package com.peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("Person", Person.class);
        person.method();
        System.out.println(person.getAnimal() + " " + person.getName() + " " + person.getAge());


    }
}
