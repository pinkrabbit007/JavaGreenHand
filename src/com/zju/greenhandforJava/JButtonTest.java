package com.zju.greenhandforJava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JButtonTest extends JFrame {

	public JButtonTest() {
		setLayout(new GridLayout(4, 4, 15, 15));
		Container c = getContentPane();
		for (int i = 0; i < 5; i++) {
			JButton J = new JButton("button" + i);
			final String a = "弹出对话框" + i; // 为什么这里不加final就报错
			J.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// final String a = "弹出对话框"+i;这句话写在这里为什么错
					JOptionPane.showMessageDialog(null, a);
				}
			});
			c.add(J);
			if (i % 2 == 0) {
				J.setEnabled(false);
			}
		}
		this.setVisible(true);
		setSize(450, 200);
		JButton jb = new JButton();
		jb.setToolTipText("图片按钮");
		jb.setText("show");
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		c.add(jb);

		JRadioButton jr1 = new JRadioButton();
		JRadioButton jr2 = new JRadioButton();
		JRadioButton jr3 = new JRadioButton();
		// ButtonGroup group = new ButtonGroup();//这两步是拿来干嘛的？
		// group.add(jr1); group.add(jr2); group.add(jr3);
		c.add(jr1);
		c.add(jr2);
		c.add(jr3);

	}
}
