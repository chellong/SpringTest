package com.example.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityHandler  {
	
	/**
	 * ƥ��add����
	 * 
	 * ����Pointcut
	 * �˷���û�в����ͷ���ֵ
	 * �÷�����һ����ʾ�������е���
	 */
	@Pointcut("execution(* add*(..))")
	private void addAddMethod(){
		
	}
	
	/**
	 * ����advice����ʾ����Ӧ�õ���Щpointcut���ĵ�joinpoint
	 */
	
	@Before("addAddMethod()")
	private void checkSecurity() {
		System.out.println("-------checkSecurity-------");
	}
	
}