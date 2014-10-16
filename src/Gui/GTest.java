package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GTest extends JFrame{
	private Container contentPane;
	private JPanel jp;
	private JLabel resultLbl;
	public GTest(String title){
		setTitle(title);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	public void init(){
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp = new JPanel();
		resultLbl = new JLabel();
		jp.setPreferredSize(new Dimension(100,100));
		jp.setBackground(Color.BLUE);
		contentPane.add(jp);
		contentPane.add(resultLbl);
		jp.addMouseListener(
			new MouseListener(){
				public void mouseEntered(MouseEvent e){}
				public void mouseClicked(MouseEvent e){
					int x = e.getX();
					int y = e.getY();
					String str = "x,y result:"+x+" , "+y;
					resultLbl.setText(str);
}
				public void mouseExited(MouseEvent e){}
				public void mousePressed(MouseEvent e){}
				public void mouseReleased(MouseEvent e){}
			}
		);
	}

	public static void main(String[] args){
		new GTest("Test2").setVisible(true);
	}
}
