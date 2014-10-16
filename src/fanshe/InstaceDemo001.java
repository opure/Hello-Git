package fanshe;

class Person{
	private String name ;	// name����
	private int age ;		// age����
	public void setName(String name){
		this.name = name ;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
	public String toString(){	// ��дtoString()����
		return "������" + this.name + "�����䣺" + this.age  ;
	}
};
public class InstaceDemo001{
	public static void main(String args[]){
		Class<?> c = null ;		// ����Class����
		try{
			c = Class.forName("fanshe.Person") ;
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Person per = null ;	// ����Person����
		try{
			per = (Person)c.newInstance() ;	// ʵ��������
		}catch(Exception e){
			e.printStackTrace() ;
		}
		per.setName("caohao") ;		// ��������
		per.setAge(20) ;				// ��������
		System.out.println(per) ;	// �������������toString()
	}
};