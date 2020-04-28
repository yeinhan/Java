package com.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_OtherClass extends JFrame {
	private JButton btn;
	private JLabel label;
	
	public B_OtherClass() {
		this.setSize(200,200);
		this.setTitle("Other Class");
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼을 눌러보세용");
		label = new JLabel("아직 버튼이...");
		
		btn.addActionListener(new MyEvent(btn, label));
		
		panel.add(btn);
		panel.add(label);
		
		this.add(panel);

		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	class MyEvent implements ActionListener{

		private JButton btn;
		private JLabel label;
		
		public MyEvent() {}
		
		public MyEvent (JButton btn, JLabel label) {
			btn.addActionListener(this);
			this.label = label;
			
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("드디어 버튼이....");
		}
		
	}
}
