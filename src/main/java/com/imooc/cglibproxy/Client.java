package com.imooc.cglibproxy;


import com.onemt.agent.annotation.TraceClass;
import com.onemt.agent.annotation.TraceMethod;

@TraceClass(classDescription="Client")
public class Client {
	

	/**
	 * @param args
	 */
	@TraceMethod
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
				long startTime = System.currentTimeMillis();
				CglibProxy proxy = new CglibProxy();
				Train t = (Train)proxy.getProxy(Train.class);
				t.move();
				long endTime = System.currentTimeMillis();
				System.out.println("执行耗时:"+(endTime-startTime));
		}
		
		
		
	}

}
