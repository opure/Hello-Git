package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public  class ListTest{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   ArrayList list=new ArrayList();
	   do{
		   String name=sc.next();
		   if(name.equals("over"))
			   break;
		   list.add(name);
		   
		   
	   }while(true);
	   System.out.println(list);
		   
		   
}
}