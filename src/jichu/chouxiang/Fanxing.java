package jichu.chouxiang;
class Info<T>{
	private T var ;
	public T getVar(){
		return this.var ;
	}
	public void setVar(T var){
		this.var = var ;
	}
	public String toString(){		// 覆写Object类中的toString()方法
		return this.var.toString() ;
	}
};
public class Fanxing{
	public static void main(String args[]){
		Info<Object> i = new Info<Object>() ;		// 指定Object为泛型类型
		i.setVar("MLDN") ;			// 设置字符串
		System.out.println("内容：" + i.getVar()) ;
	}
};