package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entity.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/test/xml/beans.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher.getName());
        System.out.println(teacher.getStudent().getName());
        
        ((ConfigurableApplicationContext)applicationContext).close();
    }
}
