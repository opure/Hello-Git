package jichu.duixiang;

class Demo011{	// 定义Person类
	private String name ;			// 保存名字
	private static int count = 0 ;	// 所有对象共享此属性
	public Demo011(){
		count++ ;					// 有对象产生就自增
		this.name = "DEMO-" + count ;	// 自动进行编名操作
	} 
	public Demo011(String name){
	
		this.name = name;			// 可以通过构造赋值
	}
	public String getName(){		// 取得姓名
		return this.name ;
	}
};
public class StaticTest{
	public static void main(String args[]){
		System.out.println(new Demo011().getName()) ;
		System.out.println(new Demo011("LXH").getName()) ;
		System.out.println(new Demo011().getName()) ;
		System.out.println(new Demo011("MLDN").getName()) ;
		System.out.println(new Demo011().getName()) ;
	}
};