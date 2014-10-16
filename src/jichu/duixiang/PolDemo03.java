package jichu.duixiang;

class Ad{					// 定义类A
	public void fun1(){		// 定义fun1()方法
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// 调用fun1()方法
	}
};
class Bd extends Ad{
	public void fun1(){		// 此方法被子类覆写了
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
class Cd extends Ad{
	public void fun1(){		// 此方法被子类覆写了
		System.out.println("C --> public void fun1(){}") ;
	}
	public void fun5(){
		System.out.println("C --> public void fun5(){}") ;
	}
};
public class PolDemo03{
	public static void main(String asrgs[]){
		fun(new Bd()) ;	// 传递B的实例
		fun(new Cd()) ;	// 传递B的实例
	}
	public static void fun(Ad a){
		a.fun1() ;		// 调用覆写父类中的fun1()方法
	}
};