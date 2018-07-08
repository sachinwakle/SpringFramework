package com.sachin.aop.base.joinpoints;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 1037696 SACHIN WAKLE
 *
 */
@Aspect
public class LoggingAspect {
	

	
	@Before("allCircleMethods()")
	public void loggingAspectAdvice(JoinPoint joinPoint)
	{
		System.out.println("Logging Aspect advice called: "+joinPoint.toString());
		System.out.println("Current Object: "+joinPoint.getTarget());
	}
	
	/**
	 * "within" expression can be used for including all
	 * methods from particular class, So this pointcut 
	 * will be applicable for all methods in Circle class
	 */
	@Pointcut("within(com.sachin.aop.base.joinpoints.Circle)")
	public void allCircleMethods(){}
	
	
	
	/*
	 * this way also works
	 */
	/*@Before("args(String)")
	public void stringArgumentMethod()
	{
		System.out.println("Method has been called which takes single string argument: ");
	}*/
	

	
	/**
	 * This is another expression in aspect to specify the methods having arguments 
	 */
	@Before("args(name)")
	public void stringArgumentMethod(String name)
	{
		name = name + " \"appended from advice\"";
		System.out.println("Method has been called which takes single string argument: Argument value: "+name);
	}
	

}
