package com.zju.greenhandforJava;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//import circle.myException;

public class helloworld {

	public static void main(String[] args) throws myException {
		// TODO �Զ����ɵķ������
		String a = new String("abc");
		// Testforfather cc = new Testforfather();
		// cc.dosomething();
		Testforchild dd = new Testforchild();

		// new Example1("ok");
		// new MyFrame("think");
		// new AbsolutePosition();
		// new FlowLayoutPosition();
		// Ftest thisClass = new Ftest();
		// thisClass.setVisible(true);
		// new JButtonTest();
		// new CheckBoxTest();
		// new Question13_19();

		// new FocusEventTest();

		try {
			circle b = new circle(5);
			circle.innerclass c = b.new innerclass();
			System.out.println(b.getArea());
			System.out.println(b.r);
			System.out.println(c.add);
		}

		catch (myException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
