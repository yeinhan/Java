package com.gui.part03_component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class H_Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mf = new JFrame("슬라이더 테스트");
		mf.setSize(300,300);
		
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("슬라이더를 움직여 보세요");
		panel1.add(label);
		
		JPanel panel2 = new JPanel();
		JSlider slider = new JSlider(0,30,15);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		panel2.add(slider);
		
		JButton button = new JButton("전송");
		panel2.add(button);
		
		JPanel resPanel = new JPanel();
		JLabel text = new JLabel("결과값:");
		resPanel.add(text);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(slider.getValue()+"");
			}
		});
		
		
		
		
		mf.add(panel1,"North");
		mf.add(panel2,"Center");
		mf.add(resPanel,"South");
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}

}
