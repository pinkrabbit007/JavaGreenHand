package com.zju.greenhandforJava;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class DrawIcon implements Icon {

	public DrawIcon(int width, int height) {
		this.width = width;
		this.height = height;

		System.out.println("DRAWICON constuctor");
	}

	public int width;
	public int height;

	public int getIconHeight() {
		// TODO �Զ����ɵķ������
		return height;
	}

	public int getIconWidth() {
		// TODO �Զ����ɵķ������
		return width;
	}

	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		// TODO �Զ����ɵķ������
		arg1.fillOval(x, y, width, height);

	}

}
