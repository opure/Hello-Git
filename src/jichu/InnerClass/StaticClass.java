package jichu.InnerClass;

public class StaticClass {
	public static void main(String args[]){
		Tester a=new Tester();
		a.test();

	}
	
	public static class B{
		int c;
	}

}
class Tester{
	public void test(){
		StaticClass.B b=new StaticClass.B();
		b.c=1;
		System.out.println("nihao"+b.toString());
	}
}
