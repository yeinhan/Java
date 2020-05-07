package com.project.publicmask.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import com.project.publicmask.controller.Controller;

public class MainView {
	Controller c = new Controller();
	Scanner sc = new Scanner(System.in);

	private JFrame mf = new JFrame();
	private JPanel view;
	private Font f1, f2, f3;
	
	public MainView() {

//		view = mainPanel();
		view = ShowPersonList();

		mf.setTitle("공적마스크 예약 시스템");
//		try {
//			mf.setIconImage(ImageIO.read(new File("image/mask2.PNG")));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		mf.add(view);
		mf.pack();
		mf.setLocation(650, 300);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public ArrayList viewPerson() {
		return c.viewPerson();
	}
	
	public JPanel ShowPersonList() {
		viewPerson();
		
		JPanel ShowPersonList = new JPanel();
		ShowPersonList.setLayout(new BorderLayout());
		
		Font storef1 = new Font("돋음", Font.BOLD, 30);
		Font storef2 = new Font("돋음", Font.BOLD, 25);
		Font storef3 = new Font("돋음", Font.BOLD, 20);
		
//		//배열방식
		String header[] = {"이름", "주민등록번호"};
		

		DefaultTableModel model = new DefaultTableModel(header, 0);
		JTable table = new JTable(model);
		
		// 행 받아오기
		Object[] personName = c.getpersonList().toArray();
		Object[] personNum = c.getpersonList().toArray();
		
		for(int i=0; i<c.getpersonList().size(); i++) {
			personName[i] = c.getpersonList().get(i).getpName();
			personNum[i] = c.getpersonList().get(i).getpNum();
		
		}
		
		for(int i=0; i<c.getpersonList().size(); i++) {
			String[] contents = new String[2];
			
			contents[0]= (String) personName[i];
			contents[1]= (String) personNum[i];
			
			model.addRow(contents);
			
			contents [0] = null;
			contents[1]= null;
			
		}
	
		table.getTableHeader().setBackground(Color.white);
		table.setPreferredScrollableViewportSize(new Dimension(525, 200)); // 테이블 크기
		
		//제목 패널
		JPanel Panel1 = new JPanel();
	
		Panel1.setPreferredSize(new Dimension(525, 50)); // 패널 사이즈 설정으로 그 전화면과 사이즈 통일
		Panel1.setBackground(new Color(82, 204, 250));
		
		JLabel titleLabel = new JLabel("구매자 리스트");
		titleLabel.setBackground(Color.white);
		titleLabel.setForeground(Color.white);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(storef1);
		
		Panel1.add(titleLabel);
		
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBackground(Color.WHITE);
		
		//가운데 정렬위한 객체 생성
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		
		TableColumnModel tcmSchedule = table.getColumnModel();

		// 반복문을 이용하여 테이블을 가운데 정렬로 지정

		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {

			tcmSchedule.getColumn(i).setCellRenderer(celAlignCenter);

		}
		
		JPanel btnPanel = new JPanel();
		
		JButton btn = new JButton("이전으로");
	
		btnPanel.add(btn);
		btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		ShowPersonList.add(Panel1, "North");
		ShowPersonList.add(scrollpane, BorderLayout.CENTER);
		ShowPersonList.add(btnPanel,"South");
		
		return ShowPersonList;
		
	}
}
