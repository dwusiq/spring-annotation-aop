package com.wusiq.aspect.spring.annotation.aop;

import org.springframework.stereotype.Component;

@Component("demoServiceImpl")
public class DemoServiceImpl implements DemoService{

	@Override
	public void addInfo() {
		System.out.println("服务插入的数据");
	}

}
