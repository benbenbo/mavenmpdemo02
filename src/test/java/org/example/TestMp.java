package org.example;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.example.beans.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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


    public void testArSelect(){
        Employee employee=new Employee();
        //方式一：传ID
        Employee employee1 = employee.selectById(12);
        System.out.println(employee1);
        //方式二:不传ID参数
        employee=new Employee();
        employee.setId(12);
        Employee employee2 = employee.selectById();
        System.out.println(employee2);
    }

    @Test
    public void testArSelectAll(){
        Employee employee=new Employee();
        List<Employee> employees = employee.selectAll();
        System.out.println(employees);
    }


    /**
     * 携带条件的查询
     */
    public void testArSelectList(){
        Employee employee=new Employee();
        List<Employee> employees = employee.selectList(new EntityWrapper<Employee>().like("last_name", "老师"));
        System.out.println(employees);
    }

    /**
     * 统计的查询
     */
    @Test
    public void testArSelectCount(){
        Employee employee=new Employee();
        int count=employee.selectCount(new EntityWrapper<Employee>().eq("gender", "0"));
        System.out.println(count);
    }
}
