package com.event.part01_mouseAndKey;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEvent extends JFrame implements MouseListener, MouseMotionListener{

	public MouseEvent() {
		this.setTitle("Mouse Event");
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		this.add(panel);
		
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEvent();
	}
	

	public void display(String s, java.awt.event.MouseEvent e) {
		System.out.println(s+ " X="+e.getX() + " Y="+ e.getY());
	}



	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
//		this.display("Mouse dragged", e);
		
	}



	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
//		this.display("mouse moved", e);
	}



	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("Mouse clicked(click: "+e.getClickCount()+")", e);
	}



	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("Mouse pressed", e);
	}





	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("Mouse relesed", e);
	}



	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("Mouse Entered", e);
	}



	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.display("Mouse Exited", e);
	}

}
