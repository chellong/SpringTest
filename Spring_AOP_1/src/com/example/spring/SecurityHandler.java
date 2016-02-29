package com.example.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityHandler  {
	
	/**
	 * 匹配add方法
	 * 
	 * 定义Pointcut
	 * 此方法没有参数和返回值
	 * 该方法是一个标示，不进行调用
	 */
	@Pointcut("execution(* add*(..))")
	private void addAddMethod(){
		
	}
	
	/**
	 * 定义advice，标示我们应用到那些pointcut订阅的joinpoint
	 */
	
	@Before("addAddMethod()")
	private void checkSecurity() {
		System.out.println("-------checkSecurity-------");
	}
	
}
