package jichu.chouxiang;

interface Ag{
	public void printInfo() ;	// 
}
class X {
	public void fun1(){
		this.fun2(new Ag(){
				public void printInfo(){
					System.out.println("Hello World!!!") ;
				}
			}
			) ;
	}
	public void fun2(Ag a){
		a.printInfo() ;
	}
};
public class NimingLei{
	public static void main(String args[]){
		new X().fun1();// ʵ����X��Ķ��󣬲�����fun1()����
		
	}
};