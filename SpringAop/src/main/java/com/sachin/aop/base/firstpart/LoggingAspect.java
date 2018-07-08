package com.sachin.aop.base.firstpart;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 1037696 SACHIN WAKLE
 *
 */
@Aspect
public class LoggingAspect {
	
	/**
	 * In method arguments,
	 * 1.If it takes one or more arguments,
	 * you can give wildcard as get*(*)
	 * 
	 * 2. If method takes zero or more arguments,
	 * then wildcard can be used as get*(..)
	 * 
	 */
	
	
	/**
	 * Specific to particular method
	 * provide fully qualified name and method name
	 */
	
	@Before("execution(public String com.sachin.aop.base.firstpart.Circle.getName())")
	public void loggingAspectAdvice()
	{
		System.out.println("Logging Aspect advice called");
	}
	
	
	@After("allGetters()")
	public void loggingAspectAdviceAfter()
	{
		System.out.println("Logging Advice called after Get method");
	}
	
	
	/**
	 * for complex pattern, we use
	 * pointcut with dummy method
	 */
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){}
	
	
	@After("execution(public void draw())")
	public void loggingAdviceForDrawing()
	{
		System.out.println("Drawing circle advice");
	}
	
	@Before("allCircleMethods()")
	public void  welcomeLogging()
	{
		System.out.println("welcome logging");
	}
	
	
	/**
	 * "within" expression can be used for including all
	 * methods from particular class, So this pointcut 
	 * will be applicable for all methods in Circle class
	 */
	@Pointcut("within(com.sachin.aop.base.firstpart.Circle)")
	public void allCircleMethods(){}
	
	
	/*
	 * This Pointcut will be applicable for all methods of all classes
	 * from firstpart package
	 */
	@Pointcut("within(com.sachin.aop.base.firstpart.*)")
	public void secondWelcomes(){}
	
	
	
	/*
	 *  This pointcut will be applicable for all methods of all classes 
	 *  and classes of sub-packages from firstpart package
	 */
	@Pointcut("within(com.sachin.aop.base.firstpart..*)")
	public void thirdWelcomes(){}
	
	
	/*
	 * This is another way of combining the different pointcuts
	 * into single expression.
	 * It executes, if both conditions get satisfied
	 */
	@Before("allGetters() && allCircleMethods()")
	public void greetingAdvice()
	{
		System.out.println("Method execution will begin");
	}

}
