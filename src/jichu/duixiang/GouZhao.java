package jichu.duixiang;

class Person02{
	private String name ;
	private int age ;
	public Person02(String n,int a){		// �������췽����Ϊ���е����Գ�ʼ��
		setName(n) ;
		this.setAge(a) ;
	}
	public void setName(String n){
		name = n ;
	}
	public void setAge(int a){
		if(a>0&&a<150){
			age = a ;
		}
	}
	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}
	public void tell(){
		System.out.println("������" + this.getName() + "�����䣺" + this.getAge()) ;
	}
};
public class GouZhao{
	public static void main(String args[]){
		System.out.println("��������Person per = null ;") ;
		Person02 per = null ;	// ��������ʱ����ȥ���ù��췽��
		System.out.println("ʵ��������per = new Person() ;") ;
		per = new Person02("����",30) ;
		per.tell() ;
	}
};