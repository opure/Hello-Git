package IO;
import java.io.*;

public class FieDemo01 {
	public static void main(String args[]){
		File f=new File("d:");
		 File[] fi=f.listFiles();
		 for(int i=0;i<fi.length;i++){
			 System.out.println(fi[i]);
		 }
		
	}

}
