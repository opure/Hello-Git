package jichu.duixiang;

class Ad{					// ������A
	public void fun1(){		// ����fun1()����
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// ����fun1()����
	}
};
class Bd extends Ad{
	public void fun1(){		// �˷��������าд��
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
class Cd extends Ad{
	public void fun1(){		// �˷��������าд��
		System.out.println("C --> public void fun1(){}") ;
	}
	public void fun5(){
		System.out.println("C --> public void fun5(){}") ;
	}
};
public class PolDemo03{
	public static void main(String asrgs[]){
		fun(new Bd()) ;	// ����B��ʵ��
		fun(new Cd()) ;	// ����B��ʵ��
	}
	public static void fun(Ad a){
		a.fun1() ;		// ���ø�д�����е�fun1()����
	}
};