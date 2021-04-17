package org.example;

import org.example.beans.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(JUnit4.class)
public class TestMp {
    private ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void testArInsert(){
        Employee employee=new Employee();
        employee.setLastName("宋老师");
        employee.setEmail("sls@sina.com");
        employee.setGender(1);
        employee.setAge(35);
        boolean insert = employee.insert();
        System.out.println("插入结果："+insert);
    }
}
