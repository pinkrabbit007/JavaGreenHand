package com.zju.greenhandforJava;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutPosition extends JFrame {
	public FlowLayoutPosition() {
		setTitle("������ʹ�������ֹ�����");
		Container c = getContentPane();
		setLayout(new FlowLayout(2, 10, 10));
		for (int i = 0; i < 10; i++) {
			c.add(new JButton("button" + 1));
		}
		setSize(300, 200);
		setVisible(true);
	}
}