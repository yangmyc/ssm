package com.myc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myc.bean.Department;
import com.myc.dao.DepartmentMapper;

/**
 * 
 * @author Administrator
 *	
 *推荐spring的项目就可以使用spring的单元测试，可以自动注入我们需要的组件
 *1.导入springtest模块
 *2.@ContextConfiguration指定spring配置文件的位置
 *3.直接使用@Autowired组件
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departMapper;
	
	/**
	 * 测试DepartmentMapper
	 */
	
	
	@Test
	public void testCRUD(){
		
		/**
		 * 原生============================================start
		 */
		//1.创建springIOC容器
//		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从容器中获取mapper
//		Department bean=ioc.getBean(Department.class);
		
		/**
		 * 原生============================================end
		 */
		
		System.out.println(departMapper);
		
		//1.插入几个部门
		departMapper.insertSelective(new Department(1,"开发部"));
		departMapper.insertSelective(new Department(2,"测试部"));
	}
}
