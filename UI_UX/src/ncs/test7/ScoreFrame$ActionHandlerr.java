package ncs.test7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ScoreFrame$ActionHandlerr implements ActionListener{
	private JButton btn;
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField avg;
	
	public ScoreFrame$ActionHandlerr() {}
	
	public ScoreFrame$ActionHandlerr(JButton btn, JTextField total, JTextField avg,JTextField javaScore, JTextField sqlScore) {
		btn.addActionListener(this);
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.total = total;
		this.avg = avg;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		String num1 = javaScore.getText();
		String num2 = sqlScore.getText();
		
		String re_total = Integer.toString((Integer.parseInt(num1)+Integer.parseInt(num2)));
		String re_avg= String.valueOf((Integer.parseInt(num1)+Integer.parseInt(num2))/2);
		
//		int tto = Integer.parseInt(javaScore.getText())+Integer.parseInt(sqlScore.getText());
		

		total.setText(String.valueOf(re_total));
		avg.setText(String.valueOf(re_avg));
		
	}
}
