package com.seed;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {

	@Before(value="execution(* showBalence(..))")
	public void log1() {
		System.out.println("we are mainitaing logs.. fromlog1 advice");
	}
	
	
	@After(value="execution(* showBalence(..))")   //the meaning of * is any data type method
	public void log2() {
		System.out.println("we are mainitaing logs.. fromlog2 advice");
	}
	
	
	@Before(value="execution(* transferAmount*(..))") // transferAmount* it check method name is start from transferAmount and ignore rest
	public void log3() {
		System.out.println("we are mainitaing logs.. from log3 advice");
	}
	//(* transferAmount*(int))")  transferAmount*(int) it check method name is start from transferAmount and only int method ignore rest\r\n"
		
	
	@Before("myPointCut()") 
	public void log4() {
		System.out.println("we are mainitaing logs.. from log4 advice");
	}
	@Before("myPointCut()") 
	public void log5() {
		System.out.println("we are mainitaing logs.. from log5 advice");
	}
	@Pointcut("execution(public void showBalence())")
	public void myPointCut() {
		
	}
	
	
	@AfterThrowing(pointcut="execution(* witdrawAmount(..))", throwing= "exception")

      public void log7(InSufficientFund exception) {
    	  System.out.println("We are mantaing log7"+exception);
      }
}

//1) aspect:
// aspect is  a class that implement enterprise app conscience that cut across multiple classes such as transaction management

// aspect can be a normal class configure through spring XML configuration or spring aspect J annotation

//2)join point:

 //join point is a specific point of application such as a method application ,exception handling etc
 // in spring AOp is always use to  execution of method

//3)Advice :
//Advice's are the actions taken for a particular join point  @before @ after
// in terms of programming advice's are method that get executed when a certain join point with matching point cut is reach in the application

//4) point cut:
// a point cut is a expression (language) of spring Aop, use to match target method to apply advice










