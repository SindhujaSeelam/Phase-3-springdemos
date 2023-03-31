package com.examples.S05SpringJdbcDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S05SpringJdbcDemo.dao.EmployeeDAO;
import com.examples.S05SpringJdbcDemo.entity.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	create();
    	//update();
    	//delete();
    	
    	//readOneEmployee();
    	
    	readAllEmployees();
		
    }

	private static void readAllEmployees() {
	
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringJdbcDemo/springconfig.xml");
    	
    	EmployeeDAO empdao=(EmployeeDAO) ctx.getBean("empdao");
    	List<Employee> emp=empdao.read();
    	System.out.println(emp);
	}

	private static void readOneEmployee() {

ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringJdbcDemo/springconfig.xml");
    	
    	EmployeeDAO empdao=(EmployeeDAO) ctx.getBean("empdao");
    	Employee emp=empdao.read(1);
    	System.out.println(emp);
		
	}

	private static void delete() {
		
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringJdbcDemo/springconfig.xml");
    	
    	EmployeeDAO empdao=(EmployeeDAO) ctx.getBean("empdao");
    	
    	Employee emp=new Employee();
    	
    	emp.setId(2);
    	int id=emp.getId();
    	
    	empdao.delete(id);
	}

	private static void update() {
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringJdbcDemo/springconfig.xml");
    	
    	EmployeeDAO empdao=(EmployeeDAO) ctx.getBean("empdao");
    	
    	Employee emp=new Employee();
    	
    	emp.setId(2);
    	emp.setFirstName("abc");
    	emp.setLastName("xyz");
    	
    	empdao.update(emp);
		
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S05SpringJdbcDemo/springconfig.xml");
    	
    	EmployeeDAO empdao=(EmployeeDAO) ctx.getBean("empdao");
    	
    	Employee emp=new Employee();
    	
    	emp.setId(2);
    	emp.setFirstName("seelam");
    	emp.setLastName("chaitu");
    	
    	empdao.create(emp);
	}
}
