package com.zchz.test;
/**
 * 
 * @author zjq  20150905
 * @aim ��ϰswitch����
 *
 */
public class SwitchFunction {

	public static void main(String[] args) {
		int i = 4;
		switch (i) {
		default:
			System.out.println("default");//����仰��ȥ
		case 0:
			System.out.println("zero");
			break;                                //һ���Ǵ�break����
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");		
		}
 
	}

}
