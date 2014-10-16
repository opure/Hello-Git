package ChatRoom;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
public class Client extends JFrame{
	private Container contentPane;
    private JButton Start,Stop;
    private JPanel Firstline,Nextline,Lastline;
    private JTextField tf;
    private JTextArea Display;
	private JButton xuanze,sendBtn;

	public Client(String title) throws Exception{
		setTitle(title);
		contentPane = getContentPane();
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Firstline=new JPanel();
		Nextline=new JPanel();
		Lastline=new JPanel();
		Firstline.setLayout(new FlowLayout());
		JButton Start=new JButton("上线");
		JButton Stop=new JButton("下线");
		Firstline.add(Start);
		Firstline.add(Stop);
		Display=new JTextArea(20,20);
		Display.setEditable(false);
		Nextline.add(Display);
		tf = new JTextField(8);
		xuanze=new JButton("选人");
		sendBtn = new JButton("发送");
		Lastline.add(tf);
		Lastline.add(xuanze);
		Lastline.add(sendBtn);
		contentPane.add(Lastline);
		contentPane.setLayout(new BorderLayout());
		contentPane.add(Firstline,BorderLayout.NORTH);
	    contentPane.add(Nextline,BorderLayout.CENTER);
        contentPane.add(Lastline,BorderLayout.SOUTH);
		sendBtn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try{
					Socket socket = new Socket("localhost",8888);
    BufferedWriter bw = new BufferedWriter(
	new OutputStreamWriter(socket.getOutputStream())
);
					String s = tf.getText();
					Display.append(s);
					Display.append("\n");
					bw.write(s);
					bw.flush();
					bw.close();
					}catch(Exception ee){}
				}
			}
		);
	}
	public static void main(String[] args) throws Exception{
	new Client("客户端").setVisible(true);
	}
}
