package com.tap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.config.ConfigFile;
import com.tap.pojo.Employee;

public class Launch {

	public static void main(String[] args) {

		/*
		 * String configpath = "/com/tap/config/applicationContext.xml";
		 * 
		 * ApplicationContext c = new ClassPathXmlApplicationContext(configpath); //
		 * Address a1 = (Address) c.getBean("addr1"); Employee e1 = (Employee)
		 * c.getBean("emp1");
		 * 
		 * System.out.println(e1);
		 */

		
		AnnotationConfigApplicationContext a =
	new AnnotationConfigApplicationContext(ConfigFile.class);
		  
		Employee e = (Employee)a.getBean("emp");
		System.out.println(e);
		  
		  
		  
		  
	}

}
