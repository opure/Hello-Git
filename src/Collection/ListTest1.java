package Collection;
import java.util.ArrayList;

public class ListTest1{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("������A��ѧԱ����������OVER����");
		ArrayList list=new ArrayList();
	    ArrayList list1=new ArrayList();
		inputName(list);
		System.out.println("������B��ѧԱ����������OVER����");
		inputName(list1);
		list.addAll(list1);
		System.out.println("������Ҫ���ҵ�ѧԱ����");
		String name=sc.next();
		int pos=list.indexOf(name);
		if(pos==-1){
			System.out.println("bucunzia");
		
		}
		else{
			System.out.println("λ����"+pos);
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