package com.wusiq.aspect.spring.annotation.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * @author wicker
 *
 */
public class DemoTest {
  public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 DemoService demoService = (DemoService)context.getBean("demoServiceImpl");
	 demoService.addInfo();
}
}
