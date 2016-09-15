package edu.jsu.mcis;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TestDialog implements Runnable{
	private String message;
	public TestDialog(String s){
		message = s;
	}
	
	
	public void run(){
		JOptionPane.showMessageDialog(null,message,"Game Over",JOptionPane.INFORMATION_MESSAGE);
	}
}