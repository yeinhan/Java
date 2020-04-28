package com.event.part01_mouseAndKey;

import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEvent extends JFrame implements KeyListener{
	
	public KeyEvent() {
		this.setTitle("Key event");
		this.setSize(300,300);
		JTextField tf = new JTextField();
		tf.addKeyListener(this);
		this.add(tf);
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	public static void main(String[] args) {
		new KeyEvent();
	}


	public void display(String s ,java.awt.event.KeyEvent e) {
		System.out.println(s+ " "+ e.getKeyChar());
		//컨드롤 쉬프트 알트
		String str = e.isAltDown() + ":"+e.isControlDown() + ":" + e.isShiftDown();
		System.out.println(s+" "+e.getKeyChar()+" "+str);
	}
	

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		this.display("keyTyped",e);
	}




	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		this.display("KeyPressed", e);
	}




	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		this.display("KeyRelased", e);
	}
}
