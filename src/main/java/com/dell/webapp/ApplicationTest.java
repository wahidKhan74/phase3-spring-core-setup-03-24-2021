package com.dell.webapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.dell.webapp.bean.Employee;

public class ApplicationTest {

	public static void main(String[] args) {
		
		//Tightly coupled class
//		Employee  employee = new Employee();
//		employee.setEmpId(101);
//		employee.setName("Luice Litt");
//		employee.setDept("Finance");
//		employee.setSalary(872633.34);		
//		System.out.println(employee);
		
		
//		IOC : Inversion of control  => Dependency Injection 
		
//		1. Application Context Container type :- it loads every bean at startup time.
//		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
//		
//		Employee emp1= (Employee) context.getBean("emp1");
//		System.out.println(emp1);
//		System.out.println("Emp ID :: "+ emp1.getEmpId());
//		System.out.println("Emp Name :: "+ emp1.getName());
//		
//		System.out.println("--------------------");
//		Employee emp2= context.getBean("emp2",Employee.class);
//		System.out.println(emp2);
//		System.out.println("Emp ID :: "+ emp2.getEmpId());
//		System.out.println("Emp Name :: "+ emp2.getName());
		
//		2. Bean Factory Container  : it loads bean on requirement 
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("appContext.xml"));
		
		Employee employee1 = (Employee) factory.getBean("emp1");
		System.out.println(employee1);
		System.out.println("Emp ID :: "+ employee1.getEmpId());
		System.out.println("Emp Name :: "+ employee1.getName());
		
		System.out.println("--------------------");
		Employee employee2 = factory.getBean("emp2",Employee.class);
		System.out.println(employee2);
		System.out.println("Emp ID :: "+ employee2.getEmpId());
		System.out.println("Emp Name :: "+ employee2.getName());
		
		
	}
}
