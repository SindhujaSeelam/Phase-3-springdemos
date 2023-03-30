package com.examples.S02AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S02AutoWiring.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S02AutoWiring/springconfig.xml");
		 Employee e1=(Employee)ctx.getBean("emp");
		 System.out.println(e1);
    }

}
 