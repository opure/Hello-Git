package jichu.chouxiang;

interface Ah{
	public void printInfo() ;	// 
}
class Bh implements Ah{	// 实现接口
	public void printInfo(){
		System.out.println("Hello World!!!") ;
	}
};
class Xc {
	public void fun1(){
		this.fun2(new Bh()) ;
	}
	public void fun2(Ah a){
		a.printInfo() ;
	}
};
public class NimingLei01{
	public static void main(String args[]){
		new Xc().fun1() ;		// 实例化X类的对象，并调用fun1()方法
	}
};