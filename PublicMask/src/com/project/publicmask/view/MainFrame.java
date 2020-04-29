package com.project.publicmask.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.project.publicmask.controller.Controller;



public class MainFrame extends JFrame {
	private JButton btn;
	private JPanel mainFrame;
	private Controller con = new Controller();
	
	public MainFrame() {
		this.setSize(1280,720);
		this.setTitle("공적마스크 예약 시스템");
		
		mainFrame = this.callPanel1();
		this.add(mainFrame);
		
	
//		
//		panel.addMouseListener(new MyMouseAdapter());
//		
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


//	class MyMouseAdapter extends MouseAdapter {
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			replace();
//		}
//
//	}
//	public void replace() {
//		this.remove(panel);
//		this.panel = callPanel2();
//		this.add(panel);
//		this.repaint();
//	}
//
//	
	public JPanel callPanel1() {
		return new View_DrugStoreInfo();
	}
//	
//	public JPanel callPanel2() {
//		return new Panel2();
//	}

}
