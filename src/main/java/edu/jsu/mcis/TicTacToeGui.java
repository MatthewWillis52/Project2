package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TicTacToeGui extends JFrame implements ActionListener{
	JPanel panel;
	JButton[] button; 
	int count = 0;
	int sign = 0;
	public TicTacToeGui(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		this.add(panel);
		button = new JButton[9];
		for(int i = 0; i <= 8; i++){
			 button[i] = new JButton();
			 panel.add(button[i]);
			 button[i].setEnabled(true);
			 button[i].addActionListener(this);
		}
		this.pack();
		//this.setDefaultCloseOperations(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
		
	public void actionPerformed(ActionEvent e){
		count++;
		for(int i = 0 ; i <= 8; i++){
			if(button[i] == e.getSource()){
				if(sign%2 == 0){
					
					button[i].setText("X");
					button[i].setEnabled(false);
				}
				
				else{
					button[i].setText("O");
					button[i].setEnabled(false);
				}
				
			}
			
		}
		if(count >= 9){
			JOptionPane.showMessageDialog(null,"TIE");
			for(int j = 0; j <= 8; j++){
				button[j].setText("");
				button[j].setEnabled(true);
				 
			}
			count = 0;
			sign = 0;
			return;
		}
		sign++;
	}	
		
	
	public static void main(String[] args){
		new TicTacToeGui();
		
	}
	
	
	
	
}