package jichu.duixiang;
interface A{		// ����ӿ�A
	public String AUTHOR = "���˻�" ;	// ȫ�ֳ���
	public void print() ;	// ���󷽷�
	public String getInfo() ;	// ���󷽷�
}
abstract class B implements A{	// ���������B��ʵ�ֽӿ�A
	public abstract void say() ;	// ������󷽷�
}
class X extends B{	// X���߼̳�B��
	public void say(){
		System.out.println("Hello World!!!") ;
	}
	public String getInfo(){
		return "HELLO" ;
	}
	public void print(){
		System.out.println("���ߣ�" + AUTHOR) ;
	}
};
public class Interface{
	public static void main(String args[]){
		X x = new X() ;	// ʵ�����������
		x.say() ;
		x.print() ;
	}
};