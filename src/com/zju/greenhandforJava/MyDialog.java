package com.zju.greenhandforJava;
import java.awt.*;
import javax.swing.*;

public class MyDialog extends JDialog {
	public MyDialog(MyFrame frame) {
		super(frame, "��һ��JDialog����", true);
		Container container = getContentPane();
		container.add(new JLabel("����һ���Ի���"));
		setBounds(120, 120, 100, 100);
	}

}
