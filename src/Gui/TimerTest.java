package Gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimerTest extends JFrame implements ActionListener{
	 private Container contentPane;
	public void actionPerformed(ActionEvent e){
		Color c = contentPane.getBackground();
		if(c.equals(Color.red))
			contentPane.setBackground(Color.YELLOW);
		else if(c.equals(Color.YELLOW))
			contentPane.setBackground(Color.GREEN);
		else
			contentPane.setBackground(Color.RED);
	}
		

	public TimerTest(){
		contentPane = getContentPane();
		contentPane.setBackground(Color.RED);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	public void init(){
		Timer t = new Timer(3000,this);
		t.start();
	}
	public static void main(String[] args){
		new TimerTest().setVisible(true);
	}
}
