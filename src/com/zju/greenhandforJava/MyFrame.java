package com.zju.greenhandforJava;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		super(title);
		Container container = getContentPane();
		System.out.println("create MyFrame");
		container.setLayout(null);
		JLabel jl = new JLabel("����һ��JFrame����1");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		// jl.setOpaque(true);
		jl.setSize(250, 100);
		// jl.setVisible(true);
		// setVisible(true);
		JButton bl = new JButton("�����Ի���");
		bl.setBounds(100, 100, 100, 21);
		bl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyDialog(MyFrame.this).setVisible(true);
			}
		});
		container.add(bl);
		this.setVisible(true);
		this.setSize(500, 400);

		DrawIcon icon = new DrawIcon(15, 15);
		JLabel j2 = new JLabel("����", icon, SwingConstants.CENTER);
		j2.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(j2);
		j2.setSize(250, 500);
		// JFrame jf = new JFrame(); // ����һ��JFrame����
		// Container c = jf.getContentPane();
		// jf.setSize(100,100);
		// jf.setVisible(true);

		/*
		 * DrawIcon icon = new DrawIcon(15,15); JLabel j = new
		 * JLabel("����",icon,SwingConstants.CENTER); JFrame jf =new JFrame();
		 * Container cd = jf.getContentPane(); cd.add(j);
		 * //cd.setBackground(Color.white); jf.setVisible(true);
		 * jf.setSize(200,150);
		 */

	}

}