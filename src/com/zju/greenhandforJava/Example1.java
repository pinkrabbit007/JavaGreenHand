package com.zju.greenhandforJava;
import java.awt.*;
import javax.swing.*;

public class Example1 extends JFrame {

	/*
	 * public void CreateJFrame(String title) { JFrame jf = new JFrame(title);
	 * Container container = jf.getContentPane(); JLabel jl = new
	 * JLabel("����һ��created JFrame����");
	 * jl.setHorizontalAlignment(SwingConstants.CENTER); container.add(jl);
	 * container.setBackground(Color.white); jf.setVisible(true);
	 * jf.setSize(200,150);
	 * 
	 * }
	 */
	public Example1(String title) {
		super(title);
		Container container = this.getContentPane();
		JLabel jl = new JLabel("����һ��JFrame���幹��example");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		this.setVisible(true);
		this.setSize(500, 400);
	}

}
