package com.zchz.test;

/**
 * 20150913
 * @aim static代码块以及每实例化一个类都使得静态成员count加1
 *
 */

public class SwitchFunction2 {

	static public int count = 0;
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		SwitchFunction2.count = count;
	}

	static{
		System.out.println("静态类初始化");
	}
	public  SwitchFunction2()
	{
		System.out.println("实例初始化");
		count++;
	}

 

	public static void main(String args[]) {
		SwitchFunction2 a = new SwitchFunction2();
		System.out.println(SwitchFunction2.getCount());
		SwitchFunction2 b = new SwitchFunction2();
		System.out.println(SwitchFunction2.getCount());
	}
}
