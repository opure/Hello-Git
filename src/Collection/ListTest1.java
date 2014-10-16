package Collection;
import java.util.ArrayList;

public class ListTest1{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("请输入A班学员姓名，输入OVER结束");
		ArrayList list=new ArrayList();
	    ArrayList list1=new ArrayList();
		inputName(list);
		System.out.println("请输入B班学员姓名，输入OVER结束");
		inputName(list1);
		list.addAll(list1);
		System.out.println("请输入要查找的学员姓名");
		String name=sc.next();
		int pos=list.indexOf(name);
		if(pos==-1){
			System.out.println("bucunzia");
		
		}
		else{
			System.out.println("位置在"+pos);
		}
		
	}

	public static void inputName(ArrayList list) {
		do {
		String name = sc.next();
		if (name.equalsIgnoreCase("OVER"))
			break;
		list.add(name);
		} while (true);
		}
		}