package jichu.duixiang;

class Base {
public   String showMe() {
         return "Base";
    }

    public void print() {
         System.out.println(showMe());
    }
}

public class Sub extends Base {
   public String showMe() {
	   System.out.print("ddd");
         return "sub";
    }

    public static void main(String args[]) {
    	Base a=new Sub();
      Sub b=(Sub)a;
    	b.showMe();
    	
    	  //a.print();
    	//Base a=new Base();
        //a = new Sub(); 
        // a.print();//打印出结果"Base"
       
 }
}
