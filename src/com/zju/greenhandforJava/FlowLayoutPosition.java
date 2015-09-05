package com.zju.greenhandforJava;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutPosition extends JFrame {
	public FlowLayoutPosition() {
		setTitle("本窗口使用流布局管理器");
		Container c = getContentPane();
		setLayout(new FlowLayout(2, 10, 10));
		for (int i = 0; i < 10; i++) {
			c.add(new JButton("button" + 1));
		}
		setSize(300, 200);
		setVisible(true);
	}
}