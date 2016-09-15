package edu.jsu.mcis;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
	JFrame window = new JFrame("Tic-Tac-Toe");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.add(new TicTacToeGui());
	window.setBounds(300,200,300,300);
	window.setVisible(true);
	
	}
}