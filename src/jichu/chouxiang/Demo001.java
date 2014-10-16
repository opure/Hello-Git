package jichu.chouxiang;

abstract class Person{
	private String name ;		// ����name����
	private int age ;			// ����age����
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
	public void say(){		// ��˵����һ������Ĺ���
		System.out.println(this.getContent()) ;	// �������
	}
	public abstract String getContent() ;	// ˵�����������������
};
class Student extends Person{
	private float score ;
	public Student(String name,int age,float score){
		super(name,age) ;	// ���ø����еĹ��췽��
		this.score = score ;
	}
	public String getContent(){
		return	"ѧ����Ϣ --> ������" + super.getName() + 
				"�����䣺" + super.getAge() + 
				"���ɼ���" + this.score ;
	}
};
class Worker extends Person{
	private float salary ;
	public Worker(String name,int age,float salary){
		super(name,age) ;	// ���ø����еĹ��췽��
		this.salary = salary ;
	}
	public String getContent(){
		return	"������Ϣ --> ������" + super.getName() + 
				"�����䣺" + super.getAge() + 
				"�����ʣ�" + this.salary ;
	}
};
public class Demo001{
	public static void main(String args[]){
		Person per1 = null ;	// ����Person����
		Person per2 = null ;	// ����Person����
		per1 = new Student("����",20,99.0f) ;	// ѧ����һ����
		per2 = new Worker("����",30,3000.0f) ;	// ������һ����
		per1.say() ;	// ѧ��˵ѧ���Ļ�
		per2.say() ;	// ����˵���˵Ļ�
	}
};