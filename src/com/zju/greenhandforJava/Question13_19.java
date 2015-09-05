package com.zju.greenhandforJava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Question13_19 extends JFrame {

	public JCheckBox checkBox, checkBox_2;
	public JButton okButton;

	public Question13_19() {
		setTitle("作业13.19");
		// setLayout(new GridLayout(3,2,15,15));
		Container c = getContentPane();

		/*
		 * JButton jb = new JButton(); jb.setToolTipText("图片按钮");
		 * jb.setText("show"); jb.setBorderPainted(false);
		 * jb.addActionListener(new ActionListener(){ public void
		 * actionPerformed(ActionEvent e){
		 * JOptionPane.showMessageDialog(null,"弹出对话框");} }); c.add(jb);
		 * 
		 * JRadioButton jr1 = new JRadioButton(); JRadioButton jr2 = new
		 * JRadioButton(); c.add(jr1);c.add(jr2);
		 */
		// c.setLayout(new FlowLayout());
		JLabel jl = new JLabel("请选择颜色:");

		// JComboBox<String> comboBox = new JComboBox<>();
		JComboBox<String> jc = new JComboBox<>(new MyComboBox());
		c.add(jc, BorderLayout.NORTH);
		JPanel Mypanel = new JPanel();
		Mypanel.add(jl);
		Mypanel.add(jc);
		c.add(Mypanel);

		JPanel Mypanel2 = new JPanel();

		checkBox = new JCheckBox();
		checkBox.setText("男");

		Mypanel2.add(checkBox);
		checkBox_2 = new JCheckBox();
		checkBox_2.setText("女");
		Mypanel2.add(checkBox_2);
		c.add(Mypanel2, BorderLayout.NORTH);

		final JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);

		final JButton okButton = new JButton();
		okButton.setText("确定");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		panel_1.add(okButton);

		final JButton button_1 = new JButton();
		button_1.setText("取消");
		panel_1.add(button_1);
		c.add(panel_1, BorderLayout.SOUTH);

		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if ((checkBox_2.isSelected())) {
					okButton.setEnabled(false);
					// JOptionPane.showMessageDialog(null,"弹出对话框");
				} else
					okButton.setEnabled(true);
			}
		});
		checkBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if ((checkBox.isSelected())) {
					okButton.setEnabled(false);
					// JOptionPane.showMessageDialog(null,"弹出对话框");
				} else
					okButton.setEnabled(true);
			}
		});

		/*
		 * if( (checkBox.isSelected()) ) { okButton.setEnabled(false); }
		 */
		/*
		 * JComboBox<String> comboBox = new JComboBox<>();
		 * comboBox.addItem("红"); comboBox.addItem("黄"); comboBox.addItem("蓝");
		 * comboBox.addItem("黑"); c.add(comboBox, BorderLayout.NORTH);
		 * 
		 * 
		 * final JPanel panel = new JPanel(); getContentPane().add(panel,
		 * BorderLayout.CENTER);
		 * 
		 * final JCheckBox checkBox = new JCheckBox(); checkBox.setText("男");
		 * panel.add(checkBox);
		 * 
		 * final JCheckBox checkBox_1 = new JCheckBox();
		 * checkBox_1.setText("女"); panel.add(checkBox_1);
		 * 
		 * final JPanel panel_1 = new JPanel(); getContentPane().add(panel_1,
		 * BorderLayout.SOUTH);
		 * 
		 * final JButton okButton = new JButton(); okButton.setText("确定");
		 * panel_1.add(okButton);
		 * 
		 * final JButton button_1 = new JButton(); button_1.setText("取消");
		 * panel_1.add(button_1); c.add(panel);
		 */
		this.setVisible(true);
		setSize(450, 200);
	}
}

class MyComboBox2 extends AbstractListModel<String> implements
		ComboBoxModel<String> {

	private static final long serialVersionUID = 1L;
	String selecteditem = null;
	String[] test = { "红色", "蓝色", "绿色", "紫色" };

	public String getElementAt(int index) {
		return test[index];
	}

	public int getSize() {
		return test.length;
	}

	public void setSelectedItem(Object item) {
		selecteditem = (String) item;
	}

	public Object getSelectedItem() {
		return selecteditem;
	}

	public int getIndex() {
		for (int i = 0; i < test.length; i++) {
			if (test[i].equals(getSelectedItem()))
				return i;
		}
		return 0;
	}
}
