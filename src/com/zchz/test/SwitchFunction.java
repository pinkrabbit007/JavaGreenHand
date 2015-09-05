package com.zchz.test;
/**
 * 
 * @author zjq  20150905
 * @aim 练习switch函数
 *
 */
public class SwitchFunction {

	public static void main(String[] args) {
		int i = 4;
		switch (i) {
		default:
			System.out.println("default");//从这句话进去
		case 0:
			System.out.println("zero");
			break;                                //一定是从break出来
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");		
		}
 
	}

}
