package ncs.test7;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;

	public ScoreFrame() {
		this.setSize(500, 300);

		JPanel ScoreFrame = new JPanel();

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 1));
		panel1.setPreferredSize(new Dimension(500, 100));
		JPanel panel_title = new JPanel();
		JLabel Label1 = new JLabel("점수를 입력하세요");
		Label1.setFont(new Font("돋음", Font.BOLD, 20));

		panel_title.add(Label1);

		JPanel panel_input = new JPanel();
		JLabel javaLabel = new JLabel("자바: ");
		javaScore = new JTextField(10);
		JLabel sqlLabel = new JLabel("sql: ");
		sqlScore = new JTextField(10);

		panel_input.add(javaLabel);
		panel_input.add(javaScore);
//		panel_input_l.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_input.add(sqlLabel);
		panel_input.add(sqlScore);
//		panel_input_r.setLayout(new FlowLayout(FlowLayout.RIGHT));

		panel1.add(panel_title);
		panel1.add(panel_input);

		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(500, 60));
		calcBtn = new JButton("계산하기");
		panel2.add(calcBtn);



//		calcBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent event) {
//				// TODO Auto-generated method stub
//				String java = javaScore.getText();
//				System.out.println(java);
//				String sql = sqlScore.getText();
//				System.out.println(sql);
//
//				int to = Integer.parseInt(java) + Integer.parseInt(sql);
//				int avg = (Integer.parseInt(java) + Integer.parseInt(sql)) / 2;
//
//				total.setText(Integer.toString(to));
//				average.setText(Integer.toString(avg));
//
//				System.out.println(avg);
//			}
//		});

		JPanel panel3 = new JPanel();
		JLabel totalLabel = new JLabel("총점: ");
		total = new JTextField(10);
		JLabel avgLabel = new JLabel("평군: ");
		average = new JTextField(10);

		panel3.add(totalLabel);
		panel3.add(total);
		panel3.add(avgLabel);
		panel3.add(average);

		ScoreFrame.add(panel1, "North");
		ScoreFrame.add(panel2, "Center");
		ScoreFrame.add(panel3, "South");
		
		calcBtn.addActionListener(new ScoreFrame$ActionHandlerr(calcBtn, total, average,javaScore, sqlScore));


		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(ScoreFrame);

	}


	
}
