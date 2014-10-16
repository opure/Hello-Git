package fanshe;


import java.lang.reflect.Constructor ;	// ���뷴����ư�
class Person01{
	private String name ;	// name����
	private int age ;		// age����
	public Person01(String name,int age){
		this.setName(name) ;
		this.setAge(age);
	}
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
public class InstanceDemo02{
	public static void main(String args[]){
		Class<?> c = null ;		// ����Class����
		try{
			c = Class.forName("fanshe.Person01") ;
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Person01 per = null ;	// ����Person����
		Constructor<?> cons[] = null ;
		cons = c.getConstructors() ;
		try{
			per = (Person01)cons[0].newInstance("caohao",20) ;	// ʵ��������
		}catch(Exception e){
			e.printStackTrace() ;
		}
		System.out.println(per) ;	// �������������toString()
	}
};