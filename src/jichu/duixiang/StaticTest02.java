package jichu.duixiang;

class Singleton{
	private static Singleton instance = new Singleton() ;	// 在内部产生本类的实例化对象
	public static Singleton getInstance(){		// 通过静态方法取得instance对象
		return instance ;
	}
	private Singleton(){		// 将构造方法进行了封装，私有化	
	}
	public void print(){
		System.out.println("Hello World!!!") ;
	}
};
public class StaticTest02{
	public static void main(String args[]){
		Singleton s1 = null ;	// 声明对象
		Singleton s2 = null ;	// 声明对象
		Singleton s3 = null ;	// 声明对象
		s1 = Singleton.getInstance() ;	// 取得实例化对象
		s2 = Singleton.getInstance() ;	// 取得实例化对象
		s3 = Singleton.getInstance() ;	// 取得实例化对象
		s1.print() ;		// 调用方法
		s2.print() ;		// 调用方法
		s3.print() ;		// 调用方法
	}
};