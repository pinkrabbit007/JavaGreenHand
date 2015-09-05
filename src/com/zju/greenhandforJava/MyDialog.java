package com.zju.greenhandforJava;
import java.awt.*;
import javax.swing.*;

public class MyDialog extends JDialog {
	public MyDialog(MyFrame frame) {
		super(frame, "第一个JDialog窗体", true);
		Container container = getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setBounds(120, 120, 100, 100);
	}

}
