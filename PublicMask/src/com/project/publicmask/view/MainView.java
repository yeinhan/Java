package com.project.publicmask.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
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

		view = BuyerListPanel();

		mf.setTitle("공적마스크 예약 시스템");

		
		mf.add(view);
		mf.pack();
		mf.setLocation(650, 300);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public ArrayList viewPerson() {
		return c.viewPerson();
	}

	public JPanel BuyerListPanel() {
		viewPerson();

		JPanel ShowPersonPanel = new JPanel();
		ShowPersonPanel.setBackground(new Color(252,252,243));
		ShowPersonPanel.setLayout(new BorderLayout());

		Font storef1 = new Font("돋음", Font.BOLD, 30);
		Font storef2 = new Font("돋음", Font.BOLD, 25);
		Font storef3 = new Font("돋음", Font.BOLD, 20);

		// 열
		String header[] = { "이름", "주민등록번호", "구매약국" };

		DefaultTableModel model = new DefaultTableModel(header, 0);
		JTable table = new JTable(model);

		// 행 받아오기
		Object[] buyerName = c.getbuyerList().toArray();
		Object[] buyerNum = c.getbuyerList().toArray();
		Object[] buyerStore = c.getbuyerList().toArray();

		for (int i = 0; i < c.getbuyerList().size(); i++) {
			buyerName[i] = c.getbuyerList().get(i).getPname();
			buyerNum[i] = c.getbuyerList().get(i).getPnum();
			buyerStore[i] = c.getbuyerList().get(i).getStorename();

		}

		for (int i = 0; i < c.getbuyerList().size(); i++) {

			String[] contents = new String[3];

			contents[0] = (String) buyerName[i];
			contents[1] = (String) buyerNum[i];
			contents[2] = (String) buyerStore[i];

			// 행 추가
			model.addRow(contents);
			contents[0] = null;
			contents[1] = null;
			contents[2] = null;

		}

		table.getTableHeader().setBackground(Color.white);
		table.setRowHeight(30);
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setPreferredScrollableViewportSize(new Dimension(525, 200)); // 테이블 크기

		// 제목 패널
		JPanel Panel1 = new JPanel();

		Panel1.setPreferredSize(new Dimension(500, 40)); // 패널 사이즈 설정으로 그 전화면과 사이즈 통일
		Panel1.setBackground(new Color(252,252,243));
		
		JLabel Label1 = new JLabel("구매자 리스트");
		Label1.setFont(storef3);
	
		
		Panel1.add(Label1);

		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBackground(new Color(252,252,243));

		// 가운데 정렬위한 객체 생성
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);

		TableColumnModel tcmSchedule = table.getColumnModel();

		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {

			tcmSchedule.getColumn(i).setCellRenderer(celAlignCenter);

		}

		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(new Color(252,252,243));

		JButton btn = new JButton("확인");
		btn.setPreferredSize(new Dimension(60,40));
		btn.setFont(btn.getFont().deriveFont(19.0f));


		btnPanel.add(btn);
		btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		ShowPersonPanel.add(Panel1, "North");
		ShowPersonPanel.add(scrollpane, BorderLayout.CENTER);
		ShowPersonPanel.add(btn, "South");

		return ShowPersonPanel;

	}
}
