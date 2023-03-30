package com.examples.S04Interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S04Interfaceinjection.service.OrderService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S04Interfaceinjection/springconfig.xml");
		OrderService os=(OrderService)ctx.getBean("orderservice");
		os.placeOrder();
    
    }
}
