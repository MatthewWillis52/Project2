package edu.jsu.mcis;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TicTacToeGui extends JPanel implements ActionListener {
	private JButton[][] button;
	private TicTacToeModel model;
	private JLabel label;
	
	public TicTacToeGui(){
		model = new TicTacToeModel();
		button = new JButton[3][3];
		setLayout(new GridLayout(3,3));
		setupButtons();
		label = new JLabel();
	}
	
	public void setupButtons(){
		for(int i = 0; i < button.length; i++){
			for(int j = 0; j < button[i].length; j++){
				button[i][j] = new JButton();
				button[i][j].setText("");
				button[i][j].setName("Location" + i + j);
				add(button[i][j]);
				button[i][j].addActionListener(this);
			}
		}
	}

	public void actionPerformed(ActionEvent e){
		JButton b =(JButton)e.getSource();
		String name = b.getName();
		int row = Integer.parseInt(name.substring(8, 9));
		int col = Integer.parseInt(name.substring(9));
		model.makeMark(row, col);
		b.setText(model.getMark(row, col));
		checkForWin();
		
	}	
	private void checkForWin(){
		String s = "X";
		/*if(model.getWinner() == model.getWinner()){
			s = "X";
		}*/
		if(s.length()>0){
			TestDialog d = new TestDialog("The winner is "+s);
			Thread t = new Thread(d);
			t.start();
		}
	
	}
	
	
}

