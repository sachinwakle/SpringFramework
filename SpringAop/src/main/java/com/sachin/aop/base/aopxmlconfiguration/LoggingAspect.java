package com.sachin.aop.base.aopxmlconfiguration;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 1037696 SACHIN WAKLE
 *
 */
public class LoggingAspect {
	
	
	/*
	 * # Around advice give more control over 
	 * method execution. In this advice, we can configure
	 * what should happen before and after 
	 * target method execution.
	 * 
	 * # Even we can have hold over return type of target method
	 */
	
	public String aroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		String name = null;
		try 
		{
			System.out.println("Before advice");
			name = (String) proceedingJoinPoint.proceed();  // this proceed() method will actually executes target method
			System.out.println("After returning");
		} 
		catch (Throwable e)
		{
			System.out.println("after an exeption accoured");
		}
		
		System.out.println("After finally");
		return name+" changed from around advice";
	}
}
