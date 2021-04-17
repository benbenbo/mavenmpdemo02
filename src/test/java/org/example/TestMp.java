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

    public void testArInsert(){
        Employee employee=new Employee();
        employee.setLastName("宋老师");
        employee.setEmail("sls@sina.com");
        employee.setGender(1);
        employee.setAge(35);
        boolean insert = employee.insert();
        System.out.println("插入结果："+insert);
    }

    @Test
    public void testArUpdate(){
        Employee employee=new Employee();
        employee.setId(12);
        employee.setLastName("宋老实");
        employee.setEmail("sls@sina.com");
        employee.setGender(1);
        employee.setAge(36);
        boolean b = employee.updateById();
        System.out.println("更新结果："+b);
    }
}
