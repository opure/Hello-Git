package jichu.duixiang;

class Ac{					// ������A
	public void fun1(){		// ����fun1()����
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// ����fun1()����
	}
};
class Bc extends Ac{
	public void fun1(){		// �˷��������าд��
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
public class PolDemo02{
	public static void main(String asrgs[]){
	Bc b=new Bc();
		//Ac a = new Bc() ;// ʵ������һ���������
Ac a=b;
//Bc b1 = (Bc)a ;		// ����������ת�͹�ϵ
		b.fun1() ;
		b.fun2() ;
		b.fun3() ;
	}
};