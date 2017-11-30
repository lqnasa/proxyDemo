package com.news.jdkproxy;

import java.lang.reflect.Proxy;

import com.news.staticproxy.IMath;
import com.news.staticproxy.Math;

public class Test {

	/**
	 * 小结：
	 * 
	 * JDK内置的Proxy动态代理可以在运行时动态生成字节码，而没必要针对每个类编写代理类。
	 * 
	 * 中间主要使用到了一个接口InvocationHandler与Proxy.newProxyInstance静态方法，参数说明如下：
	 * 
	 * 使用内置的Proxy实现动态代理有一个问题：被代理的类必须实现接口，未实现接口则没办法完成动态代理。
	 * 
	 * 如果项目中有些类没有实现接口，则不应该为了实现动态代理而刻意去抽出一些没有实例意义的接口，通过cglib可以解决该问题。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Math targetObject = new Math();
		MyHandler myHandler = new MyHandler(targetObject);

		// loader:一个ClassLoader对象，定义了由哪个ClassLoader对象来生成代理对象进行加载
		// interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
		// h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上，间接通过invoke来执行
		IMath math = (IMath) Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), // 类加载器
				targetObject.getClass().getInterfaces(), // 获得被代理对象的所有接口
				myHandler); // InvocationHandler对象

		int n1 = 100, n2 = 5;
		math.add(n1, n2);
		math.sub(n1, n2);
		math.mut(n1, n2);
		math.div(n1, n2);

	}

}