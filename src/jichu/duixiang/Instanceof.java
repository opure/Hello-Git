package jichu.duixiang;

class Af{					// ������A
	public void fun1(){		// ����fun1()����
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// ����fun1()����
	}
};
class Bf extends Af{
	public void fun1(){		// �˷��������าд��
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
class Cf extends Af{
	public void fun1(){		// �˷��������าд��
		System.out.println("C --> public void fun1(){}") ;
	}
	public void fun5(){
		System.out.println("C --> public void fun5(){}") ;
	}
};
public class Instanceof{
	public static void main(String asrgs[]){
		fun(new Bf()) ;
		fun(new Cf()) ;
	}
	public static void fun(Af a){
		a.fun1();
		if(a instanceof Bf){
			Bf b = (Bf) a ;
			b.fun3() ;
		}
		if(a instanceof Cf){
			Cf c = (Cf) a ;
			c.fun5() ;
		}
	}
};