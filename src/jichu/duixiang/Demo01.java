package jichu.duixiang;

class Person1{
	String name ;		// ������������
	int age ;			// ������������
	public void tell(){	// ȡ����Ϣ
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class Demo01{
	public static void main(String args[]){
		Person1 per1 = null ;		// ����per1����
		Person1 per2 = null ;		// ����per2����
		per1 = new Person1() ;		// ʵ����per1����
		per2 = new Person1() ;		// ʵ����per2����

		per1.name = "����" ;		// ����per1�е�name��������
		per1.age = 30 ;				// ����per1�е�age��������
		per2.name = "����" ;
		per2.age = 33 ;				// ����per2�е�age��������

		per2 = per1 ;				// ��per1�Ķ��ڴ�ռ�ʹ��Ȩ��per2
		System.out.print("per1�����е����� --> ") ;
		per1.tell() ;				// �������еķ���
		System.out.print("per2�����е����� --> ") ;
		per2.tell() ;				// �������еķ���
	}
};