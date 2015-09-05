package com.zju.greenhandforJava;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ftest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextArea jTextArea = null;
	private JPanel controlpanel = null;
	private JButton openButton = null;
	private JButton closeButton = null;
	private JScrollPane scrollPane = null;

	private JButton getOpenButton() {
		if (openButton == null) {
			openButton = new JButton();
			openButton.setText("写入文件");
			openButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file = new File("word.txt");
					try {
						FileWriter out = new FileWriter(file);
						String s = jTextArea.getText();
						out.write(s);
						out.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});

		}
		return openButton;
	}

	private JButton getCloseButton() {
		if (closeButton == null) {
			closeButton = new JButton();
			closeButton.setText("读取文件");
			closeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file = new File("word.txt");
					try {
						FileReader in = new FileReader(file);
						char byt[] = new char[1024];
						int len = in.read(byt);
						jTextArea.setText(new String(byt, 0, len));
						in.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			});

		}
		return closeButton;
	}

	public Ftest() {
		super();
		initialize();
	}

	public void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getScrollPane(), BorderLayout.CENTER);
			jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	protected JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getJTextArea());
		}
		return scrollPane;
	}

	private JPanel getControlPanel() {
		if (controlpanel == null) {
			FlowLayout flowLayout = new FlowLayout();
			flowLayout.setVgap(1);
			controlpanel = new JPanel();
			controlpanel.setLayout(flowLayout);
			controlpanel.add(getOpenButton(), null);
			controlpanel.add(getCloseButton(), null);
		}
		return controlpanel;
	}
}
