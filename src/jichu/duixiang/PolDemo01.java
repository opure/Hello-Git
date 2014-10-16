package jichu.duixiang;

class Aa{					// 定义类A
	public void fun1(){		// 定义fun1()方法
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// 调用fun1()方法
	}
};
class Bb extends Aa{
	public void fun1(){		// 此方法被子类覆写了
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
public class PolDemo01{
	public static void main(String asrgs[]){
		// 实例化子类对象B b=new Bb() ;
		Aa a = new Bb() ; ;			// 向上转型关系
		a.fun1() ;			// 此方法被子类覆写过
		a.fun2() ;
	}
};