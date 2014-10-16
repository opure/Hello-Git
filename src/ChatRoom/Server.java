 package ChatRoom;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Server extends JFrame{
	    private Container contentPane;
	    private JButton Start,Stop;
	    private JPanel Firstline,Nextline,Lastline;
        private JTextField tf;
        private JTextArea Display;
		private JButton xuanze,xiaxian;

		public Server(String title) throws Exception{
			setTitle(title);
			contentPane = getContentPane();
			setSize(400,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			Firstline=new JPanel();
			Nextline=new JPanel();
			Lastline=new JPanel();
			Firstline.setLayout(new FlowLayout());
			JButton Start=new JButton("Start");
			JButton Stop=new JButton("Stop");
			Firstline.add(Start);
			Firstline.add(Stop);
			Display=new JTextArea(20,20);
			Display.setEditable(false);
			Nextline.add(Display);
			tf = new JTextField(8);
			xuanze=new JButton("选择");
			xiaxian = new JButton("下线");
			Lastline.add(tf);
			Lastline.add(xuanze);
			Lastline.add(xiaxian);
			contentPane.add(Lastline);
			contentPane.setLayout(new BorderLayout());
			contentPane.add(Firstline,BorderLayout.NORTH);
		    contentPane.add(Nextline,BorderLayout.CENTER);
            contentPane.add(Lastline,BorderLayout.SOUTH);
            Stop.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            	 System.exit(0);
            	}
            	
            });
			Start.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent e){
					Thread ss2=new ss1();
					ss2.start();
				 Display.append("服务器已开启，欢迎使用");
				 Display.append("\n");
				   }
				}
					);
		}
class ss1 extends Thread{
	   public void run(){
 		try{
		   ServerSocket ss = new ServerSocket(8888);
			while(true){
				Socket socket = ss.accept();
				BufferedReader br = new BufferedReader(
					new InputStreamReader(
						socket.getInputStream()
					)
				);
				Display.append(br.readLine());
				Display.append("\n");
				
				br.close();
			}		
			
		}catch(Exception ee){
		  }
	   }
 		
 	}
	public static void main(String[] args) throws Exception{
		new Server("服务器端").setVisible(true);
		
		
	}
}