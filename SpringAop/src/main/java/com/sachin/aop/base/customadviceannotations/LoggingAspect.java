package com.sachin.aop.base.customadviceannotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 1037696 SACHIN WAKLE
 *
 */
@Aspect
public class LoggingAspect {

	/*
	 * @annotation is custom annotation, can be used to apply
	 * advice to any method by annotating that method using this 
	 * annotation i.e. @Loggable
	 */
	@Around("@annotation(com.sachin.aop.base.customadviceannotations.Loggable)")
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
