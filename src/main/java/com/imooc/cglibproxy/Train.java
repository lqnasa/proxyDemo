package com.imooc.cglibproxy;

import java.util.Random;

import com.onemt.agent.annotation.TraceClass;
import com.onemt.agent.annotation.TraceMethod;
@TraceClass
public class Train {
	
	@TraceMethod
	public void move(){
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("火车行驶中...");
	}
}
