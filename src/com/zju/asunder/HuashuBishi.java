package com.zju.asunder;
/**
 * 
 * @author zjq 20151015华数java岗在线测试题目68题
 *
 */
public class HuashuBishi {

	public static void main(String[] args) {
		A ab = new B();
		ab = new B();
	}
}

class A {
	static {
		System.out.println("1");
	}

	public A() {
		System.out.println("2");
	}
}

class B extends A {
	static {
		System.out.println("a");
	}

	public B() {
		System.out.println("b");
	}
}