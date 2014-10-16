package jichu.chouxiang;
  abstract class A{
	  public abstract void print();
  }
  class b extends A{

	public void print() {
		System.out.println("hellow world");
		
	}
	  
  }
public class InteraceDemo01 {
	public static void main(String args[]){
		A a=new b();
		a.print();
	}

}
