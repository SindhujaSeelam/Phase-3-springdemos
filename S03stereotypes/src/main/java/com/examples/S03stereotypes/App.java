package com.examples.S03stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S03stereotypes.beans.Instructor;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S03stereotypes/springconfig.xml");
		 Instructor e1=(Instructor)ctx.getBean("instructor");
		 System.out.println(e1);    }
}
