package com.wusiq.aspect.spring.annotation.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面
 * @author wicker
 *
 */
@Aspect
@Component
public class LoggingAspect {
	
	/**
	 * 前置通知
	 */
	@Before("execution(* com.wusiq.aspect.spring.annotation.aop.*.*(..))")
	public void beforeHandler() {
		System.out.println("方法调用之前的通知");
	}
}
