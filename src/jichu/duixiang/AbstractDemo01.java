package jichu.duixiang;

abstract class Person002{
	private String name ;		// ����name����
	private int age ;			// ����age����
	public Person002(String name,int age){
		this.name = name ;
		this.age = age ;
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
	public abstract String getInfo() ;	// ���󷽷�
};
class Student001 extends Person002{
	private String school ;
	public Student001(String name,int age,String school){
		super(name,age) ;	// ָ��Ҫ���ó������������������Ĺ��췽��
		this.school = school ;
	}
	public void setSchool(String school){
		this.school = school ;
	}
	public String getSchool(){
		return this.school ;
	}
	public String getInfo(){
		return	"������" + super.getName()  + 
				"�����䣺" + super.getAge() + 
				"��ѧУ��" + this.getSchool() ;
	}
};
public class AbstractDemo01{
	public static void main(String args[]){
		Student001 stu = new Student001("����",30,"�廪��ѧ") ;
		System.out.println(stu.getInfo()) ;
	}
};