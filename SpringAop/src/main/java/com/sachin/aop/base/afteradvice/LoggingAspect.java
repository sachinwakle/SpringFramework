package com.sachin.aop.base.afteradvice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author 1037696 SACHIN WAKLE
 *
 */
@Aspect
public class LoggingAspect {
	
	/**
	 * This is another expression in aspect to specify the methods having arguments 
	 */
	@AfterReturning(pointcut="args(name)", returning="returningValue")
	public void stringArgumentMethod(String name,String returningValue)
	{
		System.out.println("Method has been called which takes single string argument. Argument value: "+returningValue);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, RuntimeException ex)
	{
		System.out.println("An exception has occured: "+ex.toString());
	}
}
