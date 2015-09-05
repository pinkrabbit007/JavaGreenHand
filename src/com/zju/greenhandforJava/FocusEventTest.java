package com.zju.greenhandforJava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class FocusEventTest extends JFrame {
	public JTextField jt;
	public JPasswordField jt2;
	public String username;
	public char[] password;

	public FocusEventTest() {

		jt = new JTextField("username", 10);
		jt2 = new JPasswordField("password", 10);
		Container c = getContentPane();
		c.add(jt);
		c.add(jt2);
		final JPanel panel = new JPanel();
		c.add(panel, BorderLayout.CENTER);
		panel.add(jt);
		panel.add(jt2);
		jt2.setEchoChar('*');

		final JButton okButton = new JButton();
		okButton.setText("确定");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = jt.getText();
				password = jt2.getPassword();
				String a = String.valueOf(password);
				JOptionPane.showMessageDialog(null, "hello  " + username + " "
						+ a);
			}
		});
		panel.add(okButton);

		/*
		 * jt.addFocusListener(new FocusListener(){ public void
		 * focusLost(FocusEvent arg0) {
		 * //JOptionPane.showMessageDialog(null,"弹出对话框");
		 * jt.setText("hey, come back"); } public void focusGained(FocusEvent
		 * arg0) { //JOptionPane.showMessageDialog(null,"弹出对话框");
		 * jt.setText("yes, i am here"); } });
		 */

		this.setVisible(true);
		setSize(450, 200);
	}
}
