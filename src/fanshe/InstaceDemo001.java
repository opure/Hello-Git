package fanshe;

class Person{
	private String name ;	// name属性
	private int age ;		// age属性
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
	public String toString(){	// 覆写toString()方法
		return "姓名：" + this.name + "，年龄：" + this.age  ;
	}
};
public class InstaceDemo001{
	public static void main(String args[]){
		Class<?> c = null ;		// 声明Class对象
		try{
			c = Class.forName("fanshe.Person") ;
		}catch(ClassNotFoundException e){
			e.printStackTrace() ;
		}
		Person per = null ;	// 声明Person对象
		try{
			per = (Person)c.newInstance() ;	// 实例化对象
		}catch(Exception e){
			e.printStackTrace() ;
		}
		per.setName("caohao") ;		// 设置姓名
		per.setAge(20) ;				// 设置年龄
		System.out.println(per) ;	// 内容输出，调用toString()
	}
};