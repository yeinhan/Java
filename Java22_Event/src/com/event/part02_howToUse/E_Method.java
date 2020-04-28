package com.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_Method extends JFrame implements  ActionListener{

	private JButton btn;
	private JLabel label;
	
	public E_Method() {
		this.setSize(200,200);
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼 누르삼");
		label= new JLabel("아직 버튼이....");
		
		panel.add(btn);
		panel.add(label);
		this.add(panel);
		
		btn.addActionListener(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		label.setText("드디어 버튼이!!!!");
	}
	
	public static void main(String[] args) {
		new E_Method();
	}
}
