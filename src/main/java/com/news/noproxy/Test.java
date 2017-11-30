package com.news.noproxy;

public class Test {

	/**
	 * 缺点：
	 * 
	 * 1、工作量特别大，如果项目中有多个类，多个方法，则要修改多次。
	 * 
	 * 2、违背了设计原则：开闭原则（OCP），对扩展开放，对修改关闭，而为了增加功能把每个方法都修改了，也不便于维护。
	 * 
	 * 3、违背了设计原则：单一职责（SRP），每个方法除了要完成自己本身的功能，还要计算耗时、延时；每一个方法引起它变化的原因就有多种。
	 * 
	 * 4、违背了设计原则：依赖倒转（DIP），抽象不应该依赖细节，两者都应该依赖抽象。而在Test类中，Test与Math都是细节。
	 * 
	 * 使用静态代理可以解决部分问题。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Math math = new Math();
		int n1 = 100, n2 = 5;
		math.add(n1, n2);
		math.sub(n1, n2);
		math.mut(n1, n2);
		math.div(n1, n2);
	}

}