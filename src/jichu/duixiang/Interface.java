package jichu.duixiang;
interface A{		// 定义接口A
	public String AUTHOR = "李兴华" ;	// 全局常量
	public void print() ;	// 抽象方法
	public String getInfo() ;	// 抽象方法
}
abstract class B implements A{	// 定义抽象类B，实现接口A
	public abstract void say() ;	// 定义抽象方法
}
class X extends B{	// X类线继承B类
	public void say(){
		System.out.println("Hello World!!!") ;
	}
	public String getInfo(){
		return "HELLO" ;
	}
	public void print(){
		System.out.println("作者：" + AUTHOR) ;
	}
};
public class Interface{
	public static void main(String args[]){
		X x = new X() ;	// 实例化子类对象
		x.say() ;
		x.print() ;
	}
};