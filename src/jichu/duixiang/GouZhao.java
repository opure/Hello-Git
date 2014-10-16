package jichu.duixiang;

class Person02{
	private String name ;
	private int age ;
	public Person02(String n,int a){		// 声明构造方法，为类中的属性初始化
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
		System.out.println("姓名：" + this.getName() + "；年龄：" + this.getAge()) ;
	}
};
public class GouZhao{
	public static void main(String args[]){
		System.out.println("声明对象：Person per = null ;") ;
		Person02 per = null ;	// 声明对象时并不去调用构造方法
		System.out.println("实例化对象：per = new Person() ;") ;
		per = new Person02("张三",30) ;
		per.tell() ;
	}
};