package com.news.cglibproxy;

import com.news.staticproxy.Math;

public class Test {

	/**
	 * 
	 * CGLIB(Code Generation
	 * Library)是一个开源项目,是一个强大的，高性能，高质量的Code生成类库，它可以在运行期扩展Java类与实现Java接口，
	 * 通俗说cglib可以在运行时动态生成字节码。
	 * 
	 * 使用cglib完成动态代理，大概的原理是：cglib继承被代理的类，重写方法，织入通知，动态生成字节码并运行，
	 * 因为是继承所以final类是没有办法动态代理的。
	 * 
	 * 小结
	 * 使用cglib可以实现动态代理，即使被代理的类没有实现接口，但被代理的类必须不是final类。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 实例化一个DynamicProxy代理对象
		// 通过getProxyObject方法获得被代理后的对象
		Math math = (Math) new DynamicProxy().getProxyObject(new Math());

		int n1 = 100, n2 = 5;
		math.add(n1, n2);
		math.sub(n1, n2);
		math.mut(n1, n2);
		math.div(n1, n2);

	}

}