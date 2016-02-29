package com.example.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.bean.Bean1;
import com.example.spring.bean.Bean2;

@SuppressWarnings("unused")
public class Spring_AutowireByNameTest {

	private BeanFactory factory;
	
	@Test
	public void Spring_AutowireByName(){
		System.out.println("��ʼ");
		String[] configLocations = new String[]{"applicationContext-beans.xml"};
		factory = new ClassPathXmlApplicationContext(configLocations);
		
		Bean2 bean2 = (Bean2) factory.getBean("bean2");
		
		System.out.println(bean2.getBean3().getId());
	}
}
