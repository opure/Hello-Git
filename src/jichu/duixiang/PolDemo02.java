package jichu.duixiang;

class Ac{					// 定义类A
	public void fun1(){		// 定义fun1()方法
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// 调用fun1()方法
	}
};
class Bc extends Ac{
	public void fun1(){		// 此方法被子类覆写了
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
public class PolDemo02{
	public static void main(String asrgs[]){
	Bc b=new Bc();
		//Ac a = new Bc() ;// 实例化了一个父类对象
Ac a=b;
//Bc b1 = (Bc)a ;		// 发生了向下转型关系
		b.fun1() ;
		b.fun2() ;
		b.fun3() ;
	}
};