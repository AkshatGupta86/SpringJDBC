package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.EmpDao;
import com.springjdbc.entities.Emp;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc/spring.xml");
      //  JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate",JdbcTemplate.class);
       
        EmpDao empDao=context.getBean("empDao",EmpDao.class);
        
        //Insert Data
        Emp emp=new Emp();
        emp.setId(1);
        emp.setName("Akshat Gupta");
        emp.setEmail("gakshu06@gmail.com");
        emp.setDepartment("Software Developer");
        emp.setSalary(30000);
        
//        int res=empDao.insert(emp);
//        System.out.println("Data Inserted"+res);
        
        //Update Data
//        Emp emp=new Emp();
//        emp.setId(6);
//        emp.setName("Akshu");
//        emp.setEmail("gak@gmail.com");
//        emp.setDepartment("FrontEnd Developer");
//        emp.setSalary(26000);
        
//        int res=empDao.updates(emp);
//        System.out.println("data updated"+res);
        
        //delete
//        int del=empDao.delete(4);
//        System.out.println("data deleted"+del);
        
        //getSingleData
//        Emp emp=empDao.getSingle(1);
//        System.out.println(emp);
        
//        List<Emp> em=empDao.getAllData();
//        for(Emp e: em)
//        {
//        	System.out.println(e);
//        }
        
        
        
        //String insert="insert into Employee(id,name,email,department,salary) values (?,?,?,?,?)";
        //int ins=jdbcTemplate.update(insert,1,"Akshat Gupta","gakshu06@gmail.com","Software Developer",30000);
        //System.out.println("data inserted"+ins);
    
    }
}