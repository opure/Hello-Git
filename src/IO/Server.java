package IO;

import java.net.*;
import java.io.*;

public class Server{
	public static void main(String[] args) throws Exception{
		//step one
		ServerSocket ss = new ServerSocket(8888);
		//step two
		while(true){
			Socket socket = ss.accept();
			BufferedReader br = new BufferedReader(
				new InputStreamReader(
					socket.getInputStream()
				)
			);
			System.out.println(br.readLine());
			br.close();
			
		}
	}
}