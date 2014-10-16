package Gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GuiTest extends JFrame{
	private Container contentPane;
	private JTextField firstTf;
	private JLabel addLbl;
	private JTextField secondTf;
	private JButton addBtn;
	private JLabel resultLbl;
	public GuiTest(String title){
		setTitle(title);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		//contentPane.setBackground(Color.BLUE);
		init();
	}
	public void init(){
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		firstTf = new JTextField(5);
		addLbl = new JLabel("+");
		secondTf = new JTextField(5);
		addBtn = new JButton("+");
		addBtn.setSize(5,5);
		resultLbl = new JLabel("result :");
		addBtn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){	
					int i = Integer.parseInt(firstTf.getText());
					int i2 = Integer.parseInt(secondTf.getText());
					int result = i+i2;
					resultLbl.setText("result:"+result);
				}
			}
		);
		contentPane.add(firstTf);
		contentPane.add(addLbl);
		contentPane.add(secondTf);
		contentPane.add(addBtn);
		contentPane.add(resultLbl);
	}

	public static void main(String[] args){
		GuiTest g = new GuiTest("My First GUI Test Frame");
		g.setVisible(true);
	}
}

